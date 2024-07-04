package Ex4;

public class Main {
    public static void main(String[] args) {
        // Interface Segregation Principle
        // A interface Impressora foi dividida e foram criadas mais duas interfaces: Escaneadora e Fax
        // ImpressoraCanon implementa Impressora, EscaneadoraEpson implementa Escaneadora, FaxToshiba implementa Fax.
        // As instâncias dessas classes executam a o método exigido pela interface
        // Multifuncional implementa Impressora, Escaneadora e Fax e é capaz de executar as três funções.

        ImpressoraCanon impressoraCanon =  new ImpressoraCanon();
        Multifuncional multifuncional = new Multifuncional();
        FaxToshiba faxToshiba = new FaxToshiba();
        EscaneadoraEpson escaneadoraEpson = new EscaneadoraEpson();

        imprimir(impressoraCanon);
        imprimir(multifuncional);
        enviarFax(faxToshiba);
        enviarFax(multifuncional);
        escanear(escaneadoraEpson);
        escanear(multifuncional);
    }

    public static void imprimir(Impressora impressora) {
        impressora.imprimirDocumento();
    }

    public static void escanear(Escaneadora escaneadora) {
        escaneadora.escanearDocumento();
    }

    public static void enviarFax(Fax fax) {
        fax.faxearDocumento();
    }
}
