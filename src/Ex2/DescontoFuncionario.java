package Ex2;

public class DescontoFuncionario implements Desconto{
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.9;
    }
}
