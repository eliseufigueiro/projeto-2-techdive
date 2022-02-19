package HabilitPro.model.entidades;

import HabilitPro.model.services.Avaliacao;

import java.time.OffsetDateTime;


public class Modulos {

    public static long contadorIdModulos = 0;//Contador para testes, simular chave auto incremento no banco de dados
    private long idModulos;
    private Trilhas trilha;
    private String nomeModulo;
    private String habilidades;
    private Avaliacao tarefaDeValidacao;
    private OffsetDateTime prazoLimite;
    private OffsetDateTime inicioModulo;
    private OffsetDateTime finalModulo;
    private StatusModulos status;

    public Modulos(Trilhas trilha, String nomeModulo, String habilidades, StatusModulos status) {
        this.idModulos = ++contadorIdModulos;
        this.trilha = trilha;
        this.nomeModulo = nomeModulo;
        this.habilidades = habilidades;
        this.inicioModulo = OffsetDateTime.now();
        this.status = status;
    }

    public Trilhas getTrilha() {

        return trilha;
    }

    public String getNomeModulo() {

        return nomeModulo;
    }

    public void setNomeModulo(String nomeModulo) {

        this.nomeModulo = nomeModulo;
    }

    public String getHabilidades() {

        return habilidades;
    }

    public void setHabilidades(String habilidades) {

        this.habilidades = habilidades;
    }

    public Avaliacao getTarefaDeValidacao() {

        return tarefaDeValidacao;
    }

    public void setTarefaDeValidacao(Avaliacao tarefaDeValidacao) {

        this.tarefaDeValidacao = tarefaDeValidacao;
    }

    public OffsetDateTime getPrazoLimite() {

        return prazoLimite;
    }

    public void setPrazoLimite(OffsetDateTime prazoLimite) {

        this.prazoLimite = prazoLimite;
    }

    public OffsetDateTime getInicioModulo() {

        return inicioModulo;
    }

    public OffsetDateTime getFinalModulo() {

        return finalModulo;
    }

    public void setFinalModulo(OffsetDateTime finalModulo) {

        this.finalModulo = finalModulo;
    }

    public StatusModulos getStatus() {

        return status;
    }

    public void setStatus(StatusModulos status) {

        this.status = status;
    }

    @Override
    public String toString() {
        return "Modulos{" +
                "trilha=" + trilha +
                ", nomeModulo='" + nomeModulo + '\'' +
                ", habilidades='" + habilidades + '\'' +
                ", tarefaDeValidacao=" + tarefaDeValidacao +
                ", prazoLimite=" + prazoLimite +
                ", inicioModulo=" + inicioModulo +
                ", finalModulo=" + finalModulo +
                ", status=" + status +
                '}';
    }
}
