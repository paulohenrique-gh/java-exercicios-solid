package Ex1;

public class GeradorRelatorio {
    public static void gerar(Relatorio relatorio) {
        System.out.println("Gerando Relatório...");
        System.out.println("Relatório " + relatorio.getId() + " enviado ao e-mail cadastrado");
    }
}
