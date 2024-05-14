package hashbinarytree;

public class Queue {
    
    public int quantity = 0;
    public Node head = null;

    Queue() {}

    public void addNode(int value) {

        Node newnode = new Node(value);

        if (head == null) {
            head = newnode;
        }

        Node current =  head;

        while(current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newnode);

    }

    public void popNode(int value) {

        quantity--;

        if (head.getNext() == null) {
            head = null;
        }

        head = head.getNext();
    }

}
