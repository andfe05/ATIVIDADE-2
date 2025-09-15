import java.util.Scanner;

public class L2Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite o primeiro lado: ");
        double lado1 = input.nextDouble();

        System.out.print("digite o segundo lado: ");
        double lado2 = input.nextDouble();

        System.out.print("digite o terceiro lado: ");
        double lado3 = input.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é Isósceles.");
            } else {
                System.out.println("O triângulo é Escaleno.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

        input.close();
    }
}
