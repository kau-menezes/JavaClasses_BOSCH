package pointregistrer;

public class NodePoint {
    private NodePoint next = null;

    private Point value;
    
    NodePoint(Point value) {
        this.value = value;
    }
    
    public NodePoint getNext() {
        return next;
    }

    public void setNext(NodePoint next) {
        this.next = next;
    }
    

}
