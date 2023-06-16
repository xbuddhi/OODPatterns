package Proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {

    Map<String, EbookProxy> ebooks = new HashMap<>();
    
    public void add(EbookProxy ebook) {
        ebooks.put(ebook.getFileName(), ebook);
    }
    
    public void openEbook(String fileName) {
        ebooks.get(fileName).show();
    }
}
