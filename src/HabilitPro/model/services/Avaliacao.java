package HabilitPro.model.services;

import HabilitPro.model.Modulos;
import HabilitPro.model.Trabalhador;

public class Avaliacao {

    private static Integer contadorIdAvaliacao = 1;//Apenas para teste, idAvaliacao será autoincremento no banco de dados
    private Integer idAvaliacao;
    private String anotacao;
    private Integer nota;
    private Modulos modulos;
    private Trabalhador trabalhador;

    public Avaliacao(String anotacao, Integer nota, Modulos modulos, Trabalhador trabalhador) {
        this.idAvaliacao = contadorIdAvaliacao++;
        this.anotacao = anotacao;
        this.modulos = modulos;
        this.trabalhador = trabalhador;
        if (nota < 1 || nota > 5) {
            throw new IllegalArgumentException("Valor da Nota inválido.");
        } else {
            this.nota = nota;
        }
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "idAvaliacao=" + idAvaliacao +
                ", anotacao='" + anotacao + '\'' +
                ", nota=" + nota +
                ", modulos=" + modulos +
                ", trabalhador=" + trabalhador +
                '}';
    }
}
