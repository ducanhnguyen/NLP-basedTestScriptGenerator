package webanalyzer;

import org.w3c.dom.Document;

import java.util.List;

public class WebDOM {
    private List<WebCaptureImage> imagePath; // danh sach cac anh
    private Document libDOM; // DOM sinh boi thu vien

    public void setLibDOM(Document libDOM) {
        this.libDOM = libDOM;
    }

    public Document getLibDOM() {
        return libDOM;
    }

    public List<WebCaptureImage> getImagePath() {
        return imagePath;
    }

    public void setImagePath(List<WebCaptureImage> imagePath) {
        this.imagePath = imagePath;
    }
}

