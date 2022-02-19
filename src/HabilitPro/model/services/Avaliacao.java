package HabilitPro.model.services;

import HabilitPro.model.entidades.Modulos;
import HabilitPro.model.entidades.Trabalhador;
import HabilitPro.model.entidades.Usuarios;

public class Avaliacao {

    private static Integer contadorIdAvaliacao = 1;//Apenas para teste, idAvaliacao será autoincremento no banco de dados
    private Integer idAvaliacao;
    private String anotacao;
    private Integer nota;
    private Modulos modulo;
    private Trabalhador trabalhador;
    private Usuarios usuario;

    public Avaliacao(String anotacao, Modulos modulo, Trabalhador trabalhador, Usuarios usuario) {
        this.idAvaliacao = contadorIdAvaliacao++;
        this.anotacao = anotacao;
        this.modulo = modulo;
        this.trabalhador = trabalhador;
        if (nota < 1 || nota > 5) {
            throw new IllegalArgumentException("Valor da Nota inválido.");
        } else {
            this.nota = nota;
        }
        //TODO: validar o perfil de usuário
        /*if (usuario == ??) {
            throw new IllegalArgumentException("Perfil de Usuário inválido.");
        } else {
            this.usuario = usuario;
        }*/
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
