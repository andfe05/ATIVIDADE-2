import java.util.Scanner;
public class L2Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE SUA IDADE: ");
        int idade = input.nextInt();

        String status = (idade >= 18) ? "Maior de Idade" : "Menor de idade";

        System.out.println("Voce é: " + status);

        input.close();
    }
    
}
