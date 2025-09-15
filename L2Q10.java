import java.util.Scanner;
public class L2Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE UM NUMERO DE 1 A 7: ");
        int dia = input.nextInt();

        switch (dia) {
            case 1:
            System.out.println("Domingo");
            break;
            case 2:
            System.out.println("Segunda");
            break;
            case 3:
            System.out.println("Terça");
            break;
            case 4:
            System.out.println("Quarta");
            break;
            case 5:
            System.out.println("Quinta");
            break;
            case 6:
            System.out.println("Sexta");
            case 7:
            System.out.println("Sabado");
            default:
            System.out.println("Numero invalido");
        }
        input.close();

    }

}
