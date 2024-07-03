package Ex2;

public class Main {
    public static void main(String[] args) {
        Pedido pedidoEstudante = new Pedido("PE990-112", 490, new DescontoEstudante());
        Pedido pedidoIdoso = new Pedido("PI229-192", 350, new DescontoIdoso());
        Pedido pedidoFuncionario = new Pedido("PF258-177", 292, new DescontoFuncionario());

        pedidoEstudante.exibirDetalhes();
        pedidoIdoso.exibirDetalhes();
        pedidoFuncionario.exibirDetalhes();
    }
}
