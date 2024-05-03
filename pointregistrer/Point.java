package pointregistrer;

public class Point {
    private Point next = null;
    private String cpf;
    private int hour;
    private int minute;
    
    Point (String cpf, int hour, int minute) {
        this.cpf = cpf;
        this.hour = hour;
        this.minute = minute;
    }
    
    public Point getNext() {
        return next;
    }
    public void setNext(Point next) {
        this.next = next;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    
}
