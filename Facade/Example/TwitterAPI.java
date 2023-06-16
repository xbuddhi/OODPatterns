package Facade.Example;

import java.util.ArrayList;
import java.util.List;

public class TwitterAPI {

    List<Tweet> tweets= new ArrayList<>();


    public void tweet(AuthToken token, Tweet tweet) {
        System.out.println("Tweeting the message: " + tweet.getContent());
        tweets.add(tweet);
    }

    public List<Tweet> getTweets(AuthToken token, String target) {
        System.out.println("Getting tweets from " + target);
        return tweets;
    }

    public void like(AuthToken token, int id) {
        System.out.println("Liking the tweet " + tweets.get(id).getContent());
    }

    public AuthToken authenticate(String string, String string2) {
        return new AuthToken();
    }
    
}
