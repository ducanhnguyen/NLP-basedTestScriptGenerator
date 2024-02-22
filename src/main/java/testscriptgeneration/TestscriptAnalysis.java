package testscriptgeneration;

import mappinganalyzer.MappingTable;
import testdataanalyzer.TestdataTree;
import webanalyzer.WebDOM;

public class TestscriptAnalysis {
    private MappingTable mappingTable;
    private TestdataTree testdataTree;
    private WebDOM webDOM;

    public TestScript analyze() {
        return null;
    }

    public void setMappingTable(MappingTable mappingTable) {
        this.mappingTable = mappingTable;
    }

    public MappingTable getMappingTable() {
        return mappingTable;
    }

    public void setTestdataTree(TestdataTree testdataTree) {
        this.testdataTree = testdataTree;
    }

    public TestdataTree getTestdataTree() {
        return testdataTree;
    }

    public void setWebDOM(WebDOM webDOM) {
        this.webDOM = webDOM;
    }

    public WebDOM getWebDOM() {
        return webDOM;
    }
}
