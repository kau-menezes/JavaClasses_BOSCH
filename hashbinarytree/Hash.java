package hashbinarytree;

public class Hash {
    
    int occupied = 0;
    public int size = 256;
    Node[] array = new Node[size];

    Hash() {}

    public void addHash(int value) {

        Node newhashnode = new Node (value); 

        int index = value % size;

        if (array[index]!= null) {

            Node current = array[index];

            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(newhashnode);

        }
    }

    public int verify(int value) {
        int hashValue = value % 256;

        if (array[hashValue] == null) {
            return -1;
        }

        Node current = array[hashValue];

        while (array[hashValue].getNext() != null) {
            
            if (current.getValue() == value) {
                return 0;
            }
            current = current.getNext();
        }

        return 1;

    }

}
