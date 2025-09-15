import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura:  ");
        double temperatura = input.nextDouble();

        if (temperatura > 30) {
            System.out.println("Está calor!");
        } else {
            System.out.println("Não está calor.");
        }

        input.close();
    }
}
