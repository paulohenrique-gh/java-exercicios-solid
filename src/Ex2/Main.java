package Ex2;

public class Main {
    public static void main(String[] args) {
        // Open/Closed Principle
        // Caso seja necessário estender os tipos de desconto, basta criar uma classe nova implementando a interface Desconto
        // sem necessidade de alterar nada na classe Pedido para a novo desconto ser calculado corretamente

        Pedido pedidoEstudante = new Pedido("PE990-112", 490, new DescontoEstudante());
        Pedido pedidoIdoso = new Pedido("PI229-192", 350, new DescontoIdoso());
        Pedido pedidoFuncionario = new Pedido("PF258-177", 292, new DescontoFuncionario());

        pedidoEstudante.exibirDetalhes();
        pedidoIdoso.exibirDetalhes();
        pedidoFuncionario.exibirDetalhes();
    }
}
