package Ex3;

public class Main {
    public static void main(String[] args) {
        // Liskov Substituition Principle
        // O método detalharConta aceita instância de Conta ou de suas subclasses.
        // As instâncias das classes ContaCorrente e ContaPoupança podem substituir uma instância da classe Conta
        // sem impedir o funcionamento correto do programa

        ContaCorrente contaCorrente = new ContaCorrente("3902-1", "José Carlos Batista", 1500, "Visa");
        ContaPoupanca contaPoupanca = new ContaPoupanca("9982-3", "Marina Mariana", 3000, 0.05);

        detalharConta(contaCorrente);
        System.out.println("\n");
        detalharConta(contaPoupanca);
    }

    public static void detalharConta(Conta conta) {
        conta.exibirDetalhes();
    }
}
