package Iterator;

import java.util.ArrayList;
import java.util.List;
public class BrowseHistory {
    
    private String[] urls = new String[10];

    public Iterator<String> createIterator() {
        return new ListIterator(this);
    }
    
    // This is the iterator method
    public class ListIterator implements Iterator<String> {

        private BrowseHistory history;
        private int index;
        private int lastIndex;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index <=lastIndex);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

    public String[] getUrls() {
        return urls;
    }

    public void push(String url) {
        System.out.println("Pushing " + url);
        // add the url to the end of the list
        urls[urls.length - 1] = url;

    }

    public String pop() {
        // calculate the last index
        var lastIndex = urls.length - 1;
        // get the last url
        var lastUrl = urls[lastIndex];
        // remove the last url
        urls[lastIndex] = null;
        return lastUrl;
    }
}
