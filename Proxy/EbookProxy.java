package Proxy;

public class EbookProxy {
    
    private String fileName;
    private RealEbook ebook;

    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    public void show() {
        if (ebook == null) {
            ebook = new RealEbook(fileName);
        }
        ebook.show();
    }

    public String getFileName() {
        return fileName;
    }


}
