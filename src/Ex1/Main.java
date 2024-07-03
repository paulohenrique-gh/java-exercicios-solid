package Ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Single Responsability Principle
        // A classe Relatorio é responsável apenas pelos dados do relatório
        // A classe GeradorRelatorio é responsável apenas por gerar relatórios
        // A classe ImpressoraRelatorio é responsável apenas por imprimir relatórios

        Relatorio relatorio = new Relatorio("R22399-2", new ArrayList<>(Arrays.asList("V-990", "V-928", "V-329", "V-110")));

        GeradorRelatorio.gerar(relatorio);
        ImpressoraRelatorio.imprimir(relatorio);
    }
}
