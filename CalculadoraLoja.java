import java.util.Scanner;

public class CalculadoraLoja {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Calculadora da Loja da Dona Gabrielinha ===");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Quantidade de plantas: ");
                    int quantidade = scanner.nextInt();

                    System.out.print("Preço unitário: ");
                    double preco = scanner.nextDouble();

                    double total = quantidade * preco;

                    System.out.println("Preço total: R$ " + total);
                    break;

                case 2:
                    System.out.print("Valor recebido: ");
                    double recebido = scanner.nextDouble();

                    System.out.print("Valor da compra: ");
                    double compra = scanner.nextDouble();

                    double troco = recebido - compra;

                    System.out.println("Troco: R$ " + troco);
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 3);

        scanner.close();
    }
}