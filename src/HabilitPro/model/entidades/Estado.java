package HabilitPro.model.entidades;

public class Estado {

    public static long contadorIdEstado = 0;//Contador para testes, simular chave auto incremento no banco de dados
    private long idEstado;
    private String nomeEstado;
    private String siglaEstado;

    public Estado(String nomeEstado, String siglaEstado) {
        this.idEstado = ++contadorIdEstado;
        this.nomeEstado = nomeEstado;
        this.siglaEstado = siglaEstado;
    }

    public long getIdEstado() {

        return idEstado;
    }

    public String getNomeEstado() {

        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {

        this.nomeEstado = nomeEstado;
    }

    public String getSiglaEstado() {

        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {

        this.siglaEstado = siglaEstado;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "idEstado=" + idEstado +
                ", nomeEstado='" + nomeEstado + '\'' +
                ", siglaEstado='" + siglaEstado + '\'' +
                '}';
    }
}
