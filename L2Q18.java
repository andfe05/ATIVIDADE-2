import java.util.Scanner;

public class L2Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do saque (MULTIPLO DE 10): ");
        int valor = input.nextInt();

        if (valor % 10 != 0) {
            System.out.println("Valor inválido! Digite um múltiplo de 10.");
        } else {
            int notas50 = valor / 50;
            int resto = valor % 50;

            int notas20 = resto / 20;
            resto = resto % 20;

            int notas10 = resto / 10;

            System.out.println("Notas de 50: " + notas50);
            System.out.println("Notas de 20: " + notas20);
            System.out.println("Notas de 10: " + notas10);
        }

        input.close();
    }
}

