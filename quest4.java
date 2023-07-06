package quest4;

import java.util.Scanner;

public class quest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("coloque o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("coloque a quantidade: ");
        int quantidade = Integer.parseInt(scanner.nextLine());

        System.out.print("coloque o preço unitário: ");
        double precoUnitario = Double.parseDouble(scanner.nextLine());

        double total = quantidade * precoUnitario;

        System.out.println("--- Detalhes da Compra ---");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Unitário: R$ " + precoUnitario);
        System.out.println("Total: R$ " + total);

        System.out.print("Digite o percentual de desconto desejado: ");
        double percentualDesconto = Double.parseDouble(scanner.nextLine());

        double desconto = total * (percentualDesconto / 100);
        double valorFinal = total - desconto;

        System.out.println("--- Desconto ---");
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}
