package HabilitPro.model.entidades;

public class StatusModulos {

    public static long contadorIdStatus = 0;//Contador para testes, simular chave auto incremento no banco de dados
    private long idStatus;
    private String status;
    private String descricao;

    public StatusModulos(String status, String descricao) {
        this.idStatus = ++contadorIdStatus;
        this.status = status;
        this.descricao = descricao;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "StatusModulos{" +
                "status='" + status + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
