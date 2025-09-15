import java.util.Scanner;
public class L2Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE A PRIMEIRA NOTA: ");
        double n1 = input.nextDouble();

        System.out.println("DIGITE A SEGUNDA: ");
        double n2 = input.nextDouble();

        double media = (n1 + n2) / 2;

        String resultado = (media >= 6) ? "APROVADO " : "REPROVADO";

        
        System.out.println("MEDIA: " + media + " - " + resultado);

        input.close();
    }

}
