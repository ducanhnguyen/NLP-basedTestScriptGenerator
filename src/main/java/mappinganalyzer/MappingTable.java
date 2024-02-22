package mappinganalyzer;

import java.util.List;

public class MappingTable {
    private List<Dependency> dependencyList;

    public List<Dependency> getDependencyList() {
        return dependencyList;
    }

    public void setDependencyList(List<Dependency> dependencyList) {
        this.dependencyList = dependencyList;
    }
}
