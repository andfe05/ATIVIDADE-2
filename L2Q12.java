import java.util.Scanner;
public class L2Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE UM NUMERO");
        int n = input.nextInt();

        String resultado = (n >= 0) ? "Positivo" : "Negativo";

        System.out.println("O NUMERO É: " + resultado);

        input.close();

        System.out.println();
    }
}
