package Ex2;

public class DescontoIdoso implements Desconto{
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.75;
    }
}
