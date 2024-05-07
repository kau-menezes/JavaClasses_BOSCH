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
            return;
        }
        
        //declara um aux para percorrer a fila
        NodeQueue current = head;
        
        //percorre a fila até achar o último item - "início" da fila
        while (current.getNext() != null) {
            current = current.getNext();
        }
        
        current.setNext(node);
        
    }
    
    public T dequeue() {
        size--;
        head = head.getNext();
        return head.getValue();
    }

    public void printQueue() {

        NodeQueue current = head;
        for (int i = 0; i < size; i++) {
            System.out.println(current.getValue());
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
