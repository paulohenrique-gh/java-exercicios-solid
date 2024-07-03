package Ex1;

public class ImpressoraRelatorio {
    public static void imprimir(Relatorio relatorio) {
        System.out.println("Imprimindo Relatório...");
        for (String codVenda : relatorio.getCodigosVendas()) {
            System.out.println(codVenda);
        }
    }
}
