public class NodeQueue<T> {

    private T value;
    private NodeQueue next = null;

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

}
