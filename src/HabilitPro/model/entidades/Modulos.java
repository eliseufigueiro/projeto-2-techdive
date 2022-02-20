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
    private Usuarios usuario;

    public Modulos(Trilhas trilha, String nomeModulo, String habilidades, StatusModulos status) {
        this.idModulos = ++contadorIdModulos;
        this.trilha = trilha;
        this.nomeModulo = nomeModulo;
        this.habilidades = habilidades;
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

    public Usuarios getUsuario() {

        return usuario;
    }

    public void setUsuario(Usuarios usuario) {

        this.usuario = usuario;
    }

    public void setStatus(StatusModulos status) {

        for (Perfil p : usuario.getPerfilList()) {
            if (p.getNomePerfil().equals("Administrativo")) {
                if (status.getStatus().equals("Curso em andamento")) {
                    this.inicioModulo = OffsetDateTime.now();
                }

                if (status.getStatus().equals("Em fase de avaliação")) {
                    finalModulo = OffsetDateTime.now();
                    prazoLimite = OffsetDateTime.now();
                    prazoLimite();
                }
                this.status = status;
            } else {
                throw new IllegalArgumentException("Somente Usuário com Perfil Administrativo, podem fazer alterações de Status");
            }
        }
    }

    public void prazoLimite() {

        Integer dias = 10;
        while (dias > 0) {
            --dias;
            prazoLimite = prazoLimite.plusDays(1);
            if (prazoLimite.getDayOfWeek() == DayOfWeek.SATURDAY || prazoLimite.getDayOfWeek() == DayOfWeek.SUNDAY) {
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
