package HabilitPro.model.entidades;

public class SegmentoEmpresa {

    private String nomeSegmento;

    public SegmentoEmpresa(String nomeSegmento) {
        this.nomeSegmento = nomeSegmento;
    }

    public String getNomeSegmento() {
        return nomeSegmento;
    }

    public void setNomeSegmento(String nomeSegmento) {
        this.nomeSegmento = nomeSegmento;
    }

    @Override
    public String toString() {
        return "SegmentoEmpresa{" +
                "nomeSegmento='" + nomeSegmento + '\'' +
                '}';
    }
}
