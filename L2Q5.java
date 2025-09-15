import java.util.Scanner;

public class L2Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE O 1° NUMERO: ");
        int N1 = input.nextInt();

        System.out.println("DIGITE O 2° NUMERO: ");
        int N2 = input.nextInt();

        if (N1 > N2){
            System.out.println("O MAIOR É:" +N1);
        } else if (N2 > N1){
            System.out.println("O MAIOR É " +N2);
        } else {
            System.out.println("OS DOIS SAO IGUAIS ");
        }
        input.close();

    
    }


}
