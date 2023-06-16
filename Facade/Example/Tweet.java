package Facade.Example;

public class Tweet {
    private String author;
    private String content;

    public Tweet(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getContent() {
        return this.content;
    }

}
