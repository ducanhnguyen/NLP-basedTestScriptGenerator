package mappinganalyzer;

import org.w3c.dom.Element;
import testdataanalyzer.object.AbstractNode;

public class Dependency {
    private AbstractNode source;
    private Element target;

    public AbstractNode getSource() {
        return source;
    }

    public void setSource(AbstractNode source) {
        this.source = source;
    }

    public Element getTarget() {
        return target;
    }

    public void setTarget(Element target) {
        this.target = target;
    }
}
