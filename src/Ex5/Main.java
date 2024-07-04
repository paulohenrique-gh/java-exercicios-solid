package Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dependecy Inversion Principle
        // A instância de RegistradorPagamento consegue registrar tanto PagamentoCartao quanto PagamentoPaypal da mesma forma
        // porque ela depende da abstração representada na interface Pagamento, e não de suas implementações concretas

        Scanner scanner = new Scanner(System.in);

        double valor = informarValor(scanner);
        Pagamento formaPagamento = informarFormaPagamento(scanner);
        RegistradorPagamento registradorPagamento = new RegistradorPagamento(formaPagamento, valor);
        registradorPagamento.registrar();
    }

    public static double informarValor(Scanner scanner) {
        System.out.println("Informe o valor do pagamento: ");
        double valor = 0;

        while (valor <= 0) {
            try {
                valor = Double.parseDouble(scanner.nextLine());

                if (valor <= 0) {
                    System.out.println("Valor inválido");
                }
            } catch (NumberFormatException e){
                System.out.println("Valor inválido");
            }
        }

        return valor;
    }

    private static Pagamento informarFormaPagamento(Scanner scanner) {
        Pagamento pagamento = null;

        while (pagamento == null) {
            System.out.println("Escolha uma opção de pagamento: ");
            System.out.println("1 - Cartão de crédito");
            System.out.println("2 - PayPal");

            String opcao = scanner.nextLine();
            switch (opcao) {
                case "1":
                    pagamento = new PagamentoCartao();
                    break;
                case "2":
                    pagamento = new PagamentoPayPal();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

        return pagamento;
    }
}
