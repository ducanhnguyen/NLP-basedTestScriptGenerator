package com.example.testscriptgen;

import mappinganalyzer.MappingAnalysis;
import mappinganalyzer.MappingTable;
import testdataanalyzer.TestdataNLP;
import testdataanalyzer.TestdataAnalysis;
import testdataanalyzer.TestdataTree;
import testscriptgeneration.TestScript;
import testscriptgeneration.TestscriptAnalysis;
import webanalyzer.WebAnalysis;
import webanalyzer.WebDOM;

import java.io.File;

public class main {
    public static void main(String[] args) {
        String url = "http://webtest.ranorex.org/wp-login.php";
        String testdataPath = "/Users/ducanhnguyen/Documents/TestscriptGen/data/testdata/Login_001.txt";

        TestdataNLP testdataNLP = new TestdataNLP();
        testdataNLP.setSourcePath(new File(testdataPath));

        TestdataAnalysis testdataAnalysis = new TestdataAnalysis();
        testdataAnalysis.setTestdataNLP(testdataNLP);
        TestdataTree testdataTree = testdataAnalysis.analyzeTestdata();

        WebAnalysis webAnalysis = new WebAnalysis();
        webAnalysis.setUrl(url);
        WebDOM webDOM = webAnalysis.analyze();

        MappingAnalysis mappingAnalysis = new MappingAnalysis();
        mappingAnalysis.setTestdataTree(testdataTree);
        mappingAnalysis.setWebDOM(webDOM);
        MappingTable mappingTable = mappingAnalysis.map();

        TestscriptAnalysis testscriptAnalysis = new TestscriptAnalysis();
        testscriptAnalysis.setTestdataTree(testdataTree);
        testscriptAnalysis.setMappingTable(mappingTable);
        testscriptAnalysis.setWebDOM(webDOM);
        TestScript testScript = testscriptAnalysis.analyze();
        System.out.println(testScript);
    }
}
