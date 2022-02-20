package HabilitPro.model.services;

import java.time.OffsetDateTime;

public class Historico {

    private static long contadorIdHistorico = 0;//Apenas para teste, idAvaliacao será autoincremento no banco de dados
    private long idHistorico;
    private long idEmpresa;
    private long idTrilha;
    private String setor;
    private String funcao;
    private OffsetDateTime dateTime;

    public Historico(long idEmpresa, long idTrilha, String setor, String funcao) {
        this.idHistorico = ++contadorIdHistorico;
        this.idEmpresa = idEmpresa;
        this.idTrilha = idTrilha;
        this.setor = setor;
        this.funcao = funcao;
        this.dateTime = OffsetDateTime.now();
    }

    public long getIdHistorico() {

        return idHistorico;
    }

    public void setIdHistorico(long idHistorico) {

        this.idHistorico = idHistorico;
    }

    public long getIdEmpresa() {

        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {

        this.idEmpresa = idEmpresa;
    }

    public long getIdTrilha() {

        return idTrilha;
    }

    public void setIdTrilha(long idTrilha) {

        this.idTrilha = idTrilha;
    }

    public String getSetor() {

        return setor;
    }

    public void setSetor(String setor) {

        this.setor = setor;
    }

    public String getFuncao() {

        return funcao;
    }

    public void setFuncao(String funcao) {

        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Historico{" +
                "idHistorico=" + idHistorico +
                ", idEmpresa=" + idEmpresa +
                ", idTrilha=" + idTrilha +
                ", setor='" + setor + '\'' +
                ", funcao='" + funcao + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
