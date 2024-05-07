package pointregistrer;

public class PointList {

    NodePoint head = null;
    int size = 0;

    PointList() {}

    public void addNodePoint (Point valuepoint) {
        NodePoint newnodepoint = new NodePoint(valuepoint);
    }

}
