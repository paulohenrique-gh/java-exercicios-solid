package Ex2;

public class Pedido {
    private String codigo;
    private double valor;
    private Desconto desconto;

    public Pedido(String codigo, double valor, Desconto desconto) {
        this.codigo = codigo;
        this.valor = valor;
        this.desconto = desconto;
    }

    public double calcularTotal() {
        return this.valor - this.desconto.calcularDesconto(this.valor);
    }

    public void exibirDetalhes() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Valor: " + formatarNumero(this.valor));
        System.out.println("Desconto: " + formatarNumero(this.desconto.calcularDesconto(this.valor)));
        System.out.println("Total: " + formatarNumero((this.calcularTotal())) + "\n");
    }

    private String formatarNumero(double valor) {
       return String.format("%.2f", valor);
    }
}
