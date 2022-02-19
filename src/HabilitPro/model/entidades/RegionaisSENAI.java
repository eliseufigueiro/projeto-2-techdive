package HabilitPro.model.entidades;

public class RegionaisSENAI {

    private String nomeRegional;

    public RegionaisSENAI(String nomeRegional) {

        this.nomeRegional = nomeRegional;
    }

    public String getNomeRegional() {

        return nomeRegional;
    }

    public void setNomeRegional(String nomeRegional) {

        this.nomeRegional = nomeRegional;
    }

    @Override
    public String toString() {
        return "RegionaisSENAI{" +
                "nomeRegional='" + nomeRegional + '\'' +
                '}';
    }
}
