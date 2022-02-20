package HabilitPro.model.services;

import HabilitPro.model.entidades.Modulos;
import HabilitPro.model.entidades.Trabalhador;
import HabilitPro.model.entidades.Usuarios;

public class Avaliacao {

    private static Integer contadorIdAvaliacao = 0;//Apenas para teste, idAvaliacao será autoincremento no banco de dados
    private Integer idAvaliacao;
    private String anotacao;
    private Integer nota;
    private Modulos modulo;
    private Trabalhador trabalhador;
    private Usuarios usuario;

    public Avaliacao(String anotacao, Modulos modulo, Trabalhador trabalhador, Usuarios usuario) {
        this.idAvaliacao = ++contadorIdAvaliacao;
        this.anotacao = anotacao;
        this.modulo = modulo;
        this.trabalhador = trabalhador;
        /*if (usuario == usuario.getPerfil()) {
            throw new IllegalArgumentException("Perfil de Usuário inválido.");
        } else {
            this.usuario = usuario;
        }*/
    }

    public Integer getIdAvaliacao() {
        return idAvaliacao;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {

        if (nota < 1 || nota > 5) {
            throw new IllegalArgumentException("Valor da Nota inválido.");
        } else {
            this.nota = nota;
        }
    }

    public Modulos getModulo() {
        return modulo;
    }

    public void setModulo(Modulos modulo) {
        this.modulo = modulo;
    }

    public Trabalhador getTrabalhador() {
        return trabalhador;
    }

    public void setTrabalhador(Trabalhador trabalhador) {
        this.trabalhador = trabalhador;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "idAvaliacao=" + idAvaliacao +
                ", anotacao='" + anotacao + '\'' +
                ", nota=" + nota +
                ", modulos=" + modulo +
                ", trabalhador=" + trabalhador +
                '}';
    }
}
