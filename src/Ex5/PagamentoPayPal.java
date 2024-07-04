package Ex5;

public class PagamentoPayPal implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " efetuado com PayPal");
    }
}
