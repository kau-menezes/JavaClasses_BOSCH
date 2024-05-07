public class NodeQueue<T> {

    private T value;
    private NodeQueue next = null;
    private NodeQueue previous = null;

    
    NodeQueue (T value) {
        
        this.value = value;
    }
    
    public T getValue() {
        
        return value;
    }
    public void setValue(T value) {
        
        this.value = value;
    }
    public NodeQueue getNext() {
        
        return next;
    }
    public void setNext(NodeQueue next) {
        
        this.next = next;
    }
    
    public NodeQueue getPrevious() {
        return previous;
    }

    public void setPrevious(NodeQueue previous) {
        this.previous = previous;
    }

}
