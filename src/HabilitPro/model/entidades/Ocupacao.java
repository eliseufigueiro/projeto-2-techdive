package HabilitPro.model.entidades;

public class Ocupacao {

    public static long contadorIdOcupacao = 0;//Contador para testes, simular chave auto incremento no banco de dados
    private long idOcupacao;
    private String ocupacao;

    public Ocupacao(String ocupacao) {
        this.idOcupacao = ++contadorIdOcupacao;
        this.ocupacao = ocupacao;
    }

    public long getIdOcupacao() {

        return idOcupacao;
    }

    public String getOcupacao() {

        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {

        this.ocupacao = ocupacao;
    }

    @Override
    public String toString() {
        return "Ocupacao{" +
                "idOcupacao=" + idOcupacao +
                ", ocupacao='" + ocupacao + '\'' +
                '}';
    }
}
