package Facade.Example;

import java.util.List;

public class TwitterService {
    
    TwitterAPI api = new TwitterAPI();
    public void tweet(String message) {
        AuthToken token = api.authenticate("appKey", "secret");
        api.tweet(token, new Tweet(message));
    }

    public void getTweets(String target) {
        AuthToken token = api.authenticate("appKey", "secret");
        List<Tweet> tweets=api.getTweets(token, target);
        System.out.println("Tweets from " + tweets.toString());
    }

    public void like(int id) {
        AuthToken token = api.authenticate("appKey", "secret");
        api.like(token, id);
    }


}
