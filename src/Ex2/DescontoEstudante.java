package Ex2;

public class DescontoEstudante implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.5;
    }
}
