package pointregistrer;

public class Node {
    
    private Employee value;
    private Node next = null;

    // construtor
    public Node(Employee value) {
        this.value = value;
    }

    public Employee getValue() {
        return value;
    }

    public void setValue(Employee value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
