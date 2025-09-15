import java.util.Scanner;
public class L2Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = input.next().toLowerCase().charAt(0);

        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("É VOGAL");
                break;
            default:
            System.out.println("NÃO É");
        }
        input.close();
    }
}
