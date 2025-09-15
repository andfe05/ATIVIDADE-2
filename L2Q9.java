import java.util.Scanner;

public class L2Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- MENU ---");
        System.out.println("1- CADASTRAR USUARIO");
        System.out.println("2- LISTAR USUARIO");
        System.out.println("3- EXCLUIR USUARIO");
        System.out.println("0 - SAIR");
        System.out.println("ESCOLHA UMA OPÇÃO: ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("USUARIO CADASTRADO.");
                break;
            case 2:
                System.out.println("LISTANDO...");
            case 3:
                System.out.println("USUARIO EXCLUIDO");
            case 0:
                System.out.println("Saindo...");
            default:
                System.out.println("OPÇÃO INVALIDA");
        }
        input.close();
    }
    


}
