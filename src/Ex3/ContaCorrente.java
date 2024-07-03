package Ex3;

public class ContaCorrente extends Conta {
    private String bandeiraCartao;

    public ContaCorrente(String numConta, String nomeTitular, double saldo, String bandeiraCartao) {
        super(numConta, nomeTitular, saldo);
        this.bandeiraCartao = bandeiraCartao;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Bandeira do cartão: " + this.bandeiraCartao);
    }
}
