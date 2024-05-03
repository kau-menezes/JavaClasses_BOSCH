package pointregistrer;

public class NodeList {
    private Integer p = 0;
    private Integer size = 0;
    
    Node head = null;
    
    public NodeList() {}
    
    public void addEmployeeNode(Employee value) {
        
        Node newNode = new Node(value);

        size++;
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }
        
        current.setNext(newNode);
        
    }
    
    public int verifyAccess(String cpf, String password) {
        
        Node current = head;
        
        while (!current.getValue().getCpf().equals(cpf)) {
            if (current.getValue().getCpf().equals(cpf)) {
                break;
            }
            current = current.getNext();
            
        }
        
        return current.getValue().getAdmin();
        
    }

    public Integer getSize() {
        return this.size;
    }

    public void printEmployees() {
        
        Node current = head;

        for (int i = 0; i < size; i++) {
            System.out.println("Nome: " + current.getValue().getName() + " - Usuário: " + (current.getValue().getAdmin() == 1 ? "Admin" : "Normal"));
            current = current.getNext();
        }

    }
    
}
