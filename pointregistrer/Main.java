package pointregistrer;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("\n========= BEM-VINDO AO SISTEMA DE PONTO =========");
        
        // instancia o scanf :^)
        Scanner scanf = new Scanner(System.in);
        
        // instancia uma Lista de Nós
        NodeList list = new NodeList();
        
        // criando o founding father admin supremo
        Employee admin = new Employee("Admin", "123", "456789", "11082022", 1);
        list.addEmployeeNode(admin);

        // printa o Menu de Login:
        System.out.println("\nDigite seu CPF:");
        String cpfLogin = scanf.nextLine();

        System.out.println("\nDigite sua Senha:");
        String passwordLogin = scanf.nextLine();


        // percorre a lista atrás do dito cujo do usuário pra conferir as credenciais
        int userAccess = list.verifyAccess(cpfLogin, passwordLogin);

        // lida com os erros
        errorHandling(userAccess);

        if (userAccess == 0) {
            System.err.println("\nVocê deseja:\n[1] Bater ponto\n[2] Fazer Logout");

        } else{
            System.err.println("\nVocê deseja:\n[1] Cadastrar novo empregado\n[2] Listar empregados\n[3] Conferir pontos\n[4] Fazer logout\n\nR: ");

        }
        
        // previne memory leak
        scanf.close();
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
            System.err.println("\nSenha incorreta! :(");

            case 3:
            System.err.println("\nCPF não encontrado. :(");

            default:
                break;
        }

    }

}
