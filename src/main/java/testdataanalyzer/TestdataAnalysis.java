package testdataanalyzer;

public class TestdataAnalysis {
    private TestdataNLP testdataNLP;
    public TestdataTree analyzeTestdata(){
        TestdataTree testdataTree = new TestdataTree();
        return testdataTree;
    }

    public void setTestdataNLP(TestdataNLP testdataNLP) {
        this.testdataNLP = testdataNLP;
    }

    public TestdataNLP getTestdataNLP() {
        return testdataNLP;
    }
}
