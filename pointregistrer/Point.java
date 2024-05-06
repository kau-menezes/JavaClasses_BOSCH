package pointregistrer;

public class Point {
    private String cpf;
    private int hour;
    private int minute;
    
    Point (String cpf, int hour, int minute) {
        this.cpf = cpf;
        this.hour = hour;
        this.minute = minute;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    
}
