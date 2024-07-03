package Ex1;

import java.util.List;

public class Relatorio {
    private String id;
    private List<String> codigosVendas;

    public Relatorio(String id, List<String> codigosVendas) {
        this.id = id;
        this.codigosVendas = codigosVendas;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getCodigosVendas() {
        return this.codigosVendas;
    }

    public void setCodigosVendas(List<String> codigosVendas) {
        this.codigosVendas = codigosVendas;
    }
}
