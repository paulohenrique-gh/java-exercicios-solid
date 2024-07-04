package Ex5;

public class RegistradorPagamento {
    private Pagamento pagamento;
    private double valor;

    public RegistradorPagamento(Pagamento pagamento, double valor) {
        this.pagamento = pagamento;
        this.valor = valor;
    }

    public void registrar() {
        this.getPagamento().pagar(this.getValor());
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
