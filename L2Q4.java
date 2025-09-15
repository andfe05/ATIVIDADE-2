import java.util.Scanner;
public class L2Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE A NOTA FINAL DO ALUNO: ");
        double nota = input.nextDouble();

        if (nota >= 6) {
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
        }
        input.close();
    }
}
