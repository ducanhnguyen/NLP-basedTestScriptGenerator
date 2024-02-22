package testdataanalyzer.object;

import testdataanalyzer.Property;

import java.util.List;

// Dai dien cho mot dinh cua do thi cay test data
public abstract class AbstractNode {
    private String name;

    private List<Property> propertyList;

    public List<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract String generateTestscript();
}
