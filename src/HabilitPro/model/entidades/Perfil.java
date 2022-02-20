package HabilitPro.model.entidades;

public class Perfil {

    public static long contadorIdPeril = 0;
    private long idPerfil;
    private String nomePerfil;
    private String descPerfil;

    public Perfil(String nomePerfil, String descPerfil) {
        this.nomePerfil = nomePerfil;
        this.descPerfil = descPerfil;
    }

    public long getIdPerfil() {

        return idPerfil;
    }

    public void setIdPerfil(long idPerfil) {

        this.idPerfil = idPerfil;
    }

    public String getNomePerfil() {

        return nomePerfil;
    }

    public void setNomePerfil(String nomePerfil) {

        this.nomePerfil = nomePerfil;
    }

    public String getDescPerfil() {

        return descPerfil;
    }

    public void setDescPerfil(String descPerfil) {

        this.descPerfil = descPerfil;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "idPerfil=" + idPerfil +
                ", nomePerfil='" + nomePerfil + '\'' +
                ", descPerfil='" + descPerfil + '\'' +
                '}';
    }
}
