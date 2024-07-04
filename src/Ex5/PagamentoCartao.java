package Ex5;

public class PagamentoCartao implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " efetuado com cartão de crédito");
    }
}
