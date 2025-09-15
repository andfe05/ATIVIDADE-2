import java.util.Scanner;
public class L2Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.println("Digite um número inteiro: ");
    int numero = input.nextInt();

    if (numero % 2 == 0){
        System.out.println("PAR");
    } else {
        System.out.println("IMPAR");
    }
    input.close();
    }
    
    }


