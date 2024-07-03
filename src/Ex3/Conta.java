package Ex3;

public class Conta {
    protected String numConta;
    protected String nomeTitular;
    protected double saldo;

    public Conta(String numConta, String nomeTitular, double saldo) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void exibirDetalhes() {
        System.out.println("Conta: " + this.numConta + "\nTitular: " + this.nomeTitular + "\nSaldo: " + this.saldo);
    }
}
