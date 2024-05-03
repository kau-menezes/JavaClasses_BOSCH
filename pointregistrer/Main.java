package pointregistrer;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        // instancia o scanf c^:
        Scanner scanf = new Scanner(System.in);
        
        // instancia uma Lista de Nós
        NodeList list = new NodeList();
        
        // criando o founding father admin supremo
        Employee admin = new Employee("Admin", "123", "456789", "11082022", 1);
        list.addEmployeeNode(admin);

        // cria as variáveis de login
        String cpfLogin = null;
        String passwordLogin = null;

        int userAccess;
        
        while (true)
        {
            
            
            if (cpfLogin == null || passwordLogin == null) {
                    System.out.println("\n========= BEM-VINDO AO SISTEMA DE PONTO =========");

                    // printa o Menu de Login:
                    System.out.println("\nDigite seu CPF:");
                    cpfLogin = scanf.nextLine();
        
                    System.out.println("\nDigite sua Senha:");
                    passwordLogin = scanf.nextLine();
                    
                }

                // percorre a lista atrás do dito cujo do usuário pra conferir as credenciais
                userAccess = list.verifyAccess(cpfLogin, passwordLogin);
                
                // lida com os erros
                errorHandling(userAccess);

                if (userAccess == 0) {
                    System.err.print("\nVocê deseja:\n[1] Bater ponto\n[2] Fazer Logout");
                    int choice = scanf.nextInt();
                    scanf.nextLine();

                    switch (choice) {
                        case 1:
                            
                            break;
                        
                        case 2:
                            cpfLogin = null;
                            passwordLogin = null;
                            System.out.println(("\nUsuário deslogado com sucesso."));
                            break;
                        
                        default:
                            break;
                    }

    
                } else{
                    System.err.print("\nVocê deseja:\n[1] Cadastrar novo empregado\n[2] Listar empregados\n[3] Conferir pontos\n[4] Fazer logout\n\nR: ");
                    int choice = scanf.nextInt();
                    scanf.nextLine();
                
                    switch (choice) {
    
                        case 1:
                            System.out.println("\nDigite o nome do(a) empregado(a): ");
                            String employeeName = scanf.nextLine();
                            System.out.println("\nDigite o CPF do(a) empregado(a): ");
                            String employeeCPF = scanf.nextLine();
                            System.out.println("\nDigite a senha de acesso do(a) empregado(a): ");
                            String employeePassword = scanf.nextLine();
                            System.out.println("\nDigite a data de nascimento do(a) empregado(a) no formato: DDMMAAAA, com somente números: ");
                            String employeeBirthday = scanf.nextLine();
                            System.out.println("\nDigite [1] para torná-lo Administrador do Sistema ou [0] para torná-lo empregado. ");
                            int employeeAcess = scanf.nextInt();
    
                            // instancia um novo Emprgado
                            Employee newEmployee = new Employee(employeeName, employeeCPF, employeePassword, employeeBirthday, employeeAcess);
                            list.addEmployeeNode(newEmployee);
                            
                            break;
                        
                        case 2:
                            list.printEmployees();
                            break;
                        
                        case 3:
                            // ?
                            break;

                        case 4:
                            cpfLogin = null;
                            passwordLogin = null;
                            System.out.println(("\nUsuário deslogado com sucesso."));
                            break;
    
                        default:
                            break;
                    }
                }
            
            }

            // previne memory leak
            // scanf.close();
                
            }
            public static void errorHandling(int returnInt) {
    
                switch (returnInt) {
                    case 0:
                    System.err.println("\nUsuário logado com sucesso!");
                        break;
                    
                    case 1:
                    System.err.println("\nAdministrador logado com sucesso!");
                    break;
            
                    case 2:
                    System.err.println("\nSenha incorreta!");
            
                    case 3:
                    System.err.println("\nCPF não encontrado.");
            
                    default:
                        break;
                }
            
            }


}

