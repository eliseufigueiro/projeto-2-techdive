package HabilitPro.model.entidades;

import HabilitPro.model.services.Avaliacao;

import java.time.DayOfWeek;
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
        this.status = status;
        if (status.getStatus().equals("Curso em andamento")) {
            this.inicioModulo = OffsetDateTime.now();
        }
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

        if (status.getStatus().equals("Em fase de avaliação")) {
            prazoLimite = OffsetDateTime.now();
            prazoLimite();
        }
        this.status = status;
    }

    public void prazoLimite() {

        Integer dias = 10;
        while (dias > 0) {
            --dias;
            prazoLimite = prazoLimite.plusDays(1);
            if (prazoLimite.getDayOfWeek() != DayOfWeek.SATURDAY && prazoLimite.getDayOfWeek() != DayOfWeek.SUNDAY){
                ++dias;
            }
        }
    }

    @Override
    public String toString() {
        return "Modulos{" +
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
