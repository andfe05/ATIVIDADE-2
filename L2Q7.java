import java.util.Scanner;
public class L2Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE UMA NOTA DE 0 A 10:");
        double nota = input.nextDouble();

        if (nota > 9){
            System.out.println("A");
        } else if(nota > 7){
            System.out.println("B");
        } else if(nota > 5){
            System.out.println("C");
        } else if(nota > 3){
            System.out.println("D");
        } else{
            System.out.println("E");
        }
    }
}
