package Ex3;

public class ContaPoupanca extends Conta {
    private double taxaJurosAoMes;

    public ContaPoupanca(String numConta, String nomeTitular, double saldo, double taxaJurosAoMes) {
        super(numConta, nomeTitular, saldo);
        this.taxaJurosAoMes = taxaJurosAoMes;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Taxa de Juros Ao Mês: " + this.taxaJurosAoMes);
    }
}
