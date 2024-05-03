package pointregistrer;

public class Employee {
    
    private String name;
    private String cpf;
    private String password;
    private String birthDate;
    private Integer admin;
    
    // Construtor do empregado
    public Employee(String name, String cpf, String password, String birth, int admin){
        this.name = name;
        this.cpf = cpf;
        this.password = password;
        this.birthDate = birth;
        this.admin = admin;
    }

    // getters dos atributos
    public String getName() {
        return this.name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getPassword() {
        return this.password;
    }

    public String getBirthDate() {
        return this.birthDate;
    }


    public Integer getAdmin() {
        return this.admin;
    }


}
