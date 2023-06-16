package Iterator;

public class BrowseHistory {

    private String[] urls = new String[10];

    public Iterator<String> createIterator() {
        return new ListIterator(this);
    }

    private int length = 0;

    // This is the iterator method
    public class ListIterator implements Iterator<String> {

        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.length);
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
        length++;
        urls[length-1] = url; 
        // increment the length

    }

    public String pop() {
        // calculate the last index
        int lastIndex = length - 1;
        // get the last url
        String lastUrl = urls[lastIndex];
        // remove the last url
        urls[lastIndex] = null;
        // decrement the length
        length--;
        // return the last url
        return lastUrl;
    }
}
