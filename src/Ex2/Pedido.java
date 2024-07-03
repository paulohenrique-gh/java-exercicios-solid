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
        System.out.println("Valor: " + this.valor);
        System.out.println("Desconto: " + this.desconto.calcularDesconto(this.valor));
        System.out.println("Total: " + this.calcularTotal() + "\n");
    }
}
