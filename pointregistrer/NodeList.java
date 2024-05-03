package pointregistrer;

import java.security.InvalidParameterException;

public class NodeList {
    
    private Integer size = 0;
    Node head = null;

    public NodeList() {}

    public void addEmployeeNode(Employee value) {

        Node newNode = new Node(value);
        size++;

        if (head == null) {
            head = newNode;
        }

        Node current = head;

        while (current.getNext() != null) {
            current = current.getNext() ;
        }

        current.setNext(newNode);

    }

    public int verifyAccess(String cpf, String password) {

        Node current = head;
        
        do {

            if (current.getValue().getCpf() == cpf) {
                break;
            }

            if (current.getNext() == null) {
                return 3;
            }

            current = current.getNext();
        } while (current.getNext() != null);

        if (current.getValue().getPassword() != password) {
            return 2;
        }

        return current.getValue().getAdmin();

    }


}
