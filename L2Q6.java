import java.util.Scanner;
public class L2Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = input.nextInt();

        if (idade >= 0 && idade <= 12){
            System.out.println("CRIANÇA");
        } else if (idade <=17 ){
            System.out.println("ADOLESCENTE");
        } else if(idade <59){
            System.out.println("adulto");
        } else {
            System.out.println("IDOSO");
        }
        input.close();


    }
}
