package HabilitPro.model.entidades;

public class Cidade {

    public static long contadorIdCidade = 0;//Contador para testes, simular chave auto incremento no banco de dados
    private long idCidade;
    private String nomeCidade;
    private Estado estado;

    public Cidade(String nomeCidade, Estado estado) {
        this.idCidade = ++contadorIdCidade;
        this.nomeCidade = nomeCidade;
        this.estado = estado;
    }

    public long getIdCidade() {

        return idCidade;
    }

    public String getNomeCidade() {

        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {

        this.nomeCidade = nomeCidade;
    }

    public Estado getEstado() {

        return estado;
    }

    public void setEstado(Estado estado) {

        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "idCidade=" + idCidade +
                ", nomeCidade='" + nomeCidade + '\'' +
                '}';
    }
}
