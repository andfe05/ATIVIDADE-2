import java.util.Scanner;

public class L2Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE UM NUMERO: ");
        int n1 = input.nextInt();

        System.out.println("DIGITE OUTRO: ");
        int n2 = input.nextInt();

        System.out.println("OUTRO: ");
        int n3 = input.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.println("TODOS SÃO IGUAIS: " + n1);
        } 
        else {
            int maior = n1;

            if (n2 > maior) {
                maior = n2;
            }
            if (n3 > maior) {
                maior = n3;
            }

            System.out.println("O MAIOR É: " + maior);

            
            if ((maior == n1 && maior == n2) || (maior == n1 && maior == n3) || (maior == n2 && maior == n3)) {
                System.out.println(" empate entre dois números.");
            }
        }

        input.close();
    }
}
