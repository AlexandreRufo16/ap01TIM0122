package quest3;
import java.util.Scanner;
public class quest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em quilômetros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tipo da bandeira (1 ou 2): ");
        int tipoBandeira = scanner.nextInt();

        double precoKm;

        if (tipoBandeira == 1) {
            precoKm = 1.80;
        } else if (tipoBandeira == 2) {
            precoKm = 2.30;
        } else {
            System.out.println("Tipo de bandeira inválido.");
            return;
        }

        double valorCorrida = distancia * precoKm;

        System.out.println("O valor da corrida é: R$ " + valorCorrida);

        scanner.close();
    }
}