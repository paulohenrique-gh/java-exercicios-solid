package Ex4;

public class Multifuncional implements Impressora, Escaneadora, Fax{
    @Override
    public void escanearDocumento() {
        System.out.println("Escaneando documento na multifuncional");
    }

    @Override
    public void imprimirDocumento() {
        System.out.println("Imprimindo documento na multifuncional");
    }

    @Override
    public void faxearDocumento() {
        System.out.println("Enviando fax pela multifuncional");
    }
}
