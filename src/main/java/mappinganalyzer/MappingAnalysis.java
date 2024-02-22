package mappinganalyzer;

import testdataanalyzer.TestdataTree;
import webanalyzer.WebDOM;

public class MappingAnalysis {
    private WebDOM webDOM;
    private TestdataTree testdataTree;

    public MappingTable map() {
        MappingTable mappingTable = new MappingTable();
        // code here
        return mappingTable;
    }

    public void setWebDOM(WebDOM webDOM) {
        this.webDOM = webDOM;
    }

    public WebDOM getWebDOM() {
        return webDOM;
    }

    public void setTestdataTree(TestdataTree testdataTree) {
        this.testdataTree = testdataTree;
    }

    public TestdataTree getTestdataTree() {
        return testdataTree;
    }
}
