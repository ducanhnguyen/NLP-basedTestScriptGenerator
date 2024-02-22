package webanalyzer;

public class WebAnalysis {
    private String url;

    public WebDOM analyze() {
        WebDOM webDOM = new WebDOM();
        // code here
        return webDOM;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
