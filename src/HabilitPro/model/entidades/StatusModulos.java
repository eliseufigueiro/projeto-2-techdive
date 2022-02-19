package HabilitPro.model.entidades;

public class StatusModulos {

    private String idStatus;
    private String status;
    private String descricao;

    public StatusModulos(String status, String descricao) {
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
