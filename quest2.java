package quest2;
import java.util.Scanner;
public class quest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }

            System.out.print("Deseja coletar outro número? (s/n): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("valeu até a próxima!");
        scanner.close();
    }
}


