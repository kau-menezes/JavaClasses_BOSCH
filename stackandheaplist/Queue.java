public class Queue<T> {

    private int size = 0;
    NodeQueue <T>head = null;
    NodeQueue <T>tail = null;
    
    Queue () {}
    
    public void enqueue(NodeQueue node) {
        size ++;
        

        // adiciona o primeiro item da fila
        if (head == null) {
            head = node;
            tail = head;
            return;
        }

        node.setPrevious(tail);
        tail.setNext(node);
        tail = node;
        
    }
    
    public T dequeue() {
        size--;

        if (size == 0) {
            head = null;
        }

        head = head.getNext();
        return head.getValue();
    }

    public void printQueue() {

        NodeQueue current = head;
        for (int i = 0; i < size; i++) {


            System.out.println("\nValor "+ i + ": " + current.getValue());
        
        // debugging
        //    if (current.getNext() != null) {

        //        System.err.print("next: " + current.getNext().getValue() + " - ");
        //    }

        //    if (current.getPrevious() != null) {

        //        System.err.print("previous: " + current.getPrevious().getValue());
        //    }

            current = current.getNext();

        }

    }
    
    public T peek() {
        return head.getValue();
    }

    public int getSize() {
        return size;
    }

}
