package HabilitPro.model.entidades;

import java.util.List;

public class Empresa {

    public static long contadorIdEmpresa = 0;//Contador para testes, simular chave auto incremento no banco de dados
    private long idEmpresa;
    private String nomeEmpresa;
    private String cnpj;
    private String nomeFilial;
    private SegmentoEmpresa segmentoEmpresa;
    private Cidade cidade;
    private Estado estado;
    private RegionaisSENAI regionaisSENAI;
    private List<Trilhas> trilhas;

    public Empresa(String nomeEmpresa, String cnpj, SegmentoEmpresa segmentoEmpresa, Cidade cidade, Estado estado, RegionaisSENAI regionaisSENAI) {
        this.idEmpresa = ++contadorIdEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.segmentoEmpresa = segmentoEmpresa;
        this.cidade = cidade;
        this.estado = estado;
        this.regionaisSENAI = regionaisSENAI;
    }

    public Empresa(String nomeEmpresa, String cnpj, SegmentoEmpresa segmentoEmpresa, Cidade cidade, Estado estado, RegionaisSENAI regionaisSENAI, List<Trilhas> trilhas) {
        this.idEmpresa = ++contadorIdEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.segmentoEmpresa = segmentoEmpresa;
        this.cidade = cidade;
        this.estado = estado;
        this.regionaisSENAI = regionaisSENAI;
        this.trilhas = trilhas;
    }

    public Empresa(String nomeEmpresa, String cnpj, String nomeFilial, SegmentoEmpresa segmentoEmpresa, Cidade cidade, Estado estado, RegionaisSENAI regionaisSENAI) {
        this.idEmpresa = ++contadorIdEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.nomeFilial = nomeFilial;
        this.segmentoEmpresa = segmentoEmpresa;
        this.cidade = cidade;
        this.estado = estado;
        this.regionaisSENAI = regionaisSENAI;
    }

    public Empresa(String nomeEmpresa, String cnpj, String nomeFilial, SegmentoEmpresa segmentoEmpresa, Cidade cidade, Estado estado, RegionaisSENAI regionaisSENAI, List<Trilhas> trilhas) {
        this.idEmpresa = ++contadorIdEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.nomeFilial = nomeFilial;
        this.segmentoEmpresa = segmentoEmpresa;
        this.cidade = cidade;
        this.estado = estado;
        this.regionaisSENAI = regionaisSENAI;
        this.trilhas = trilhas;
    }

    public long getIdEmpresa() {

        return idEmpresa;
    }

    public String getNomeEmpresa() {

        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {

        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {

        return cnpj;
    }

    public void setCnpj(String cnpj) {

        this.cnpj = cnpj;
    }

    public String getNomeFilial() {

        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {

        this.nomeFilial = nomeFilial;
    }

    public SegmentoEmpresa getSegmentoEmpresa() {

        return segmentoEmpresa;
    }

    public void setSegmentoEmpresa(SegmentoEmpresa segmentoEmpresa) {

        this.segmentoEmpresa = segmentoEmpresa;
    }

    public Cidade getCidade() {

        return cidade;
    }

    public void setCidade(Cidade cidade) {

        this.cidade = cidade;
    }

    public Estado getEstado() {

        return estado;
    }

    public void setEstado(Estado estado) {

        this.estado = estado;
    }

    public RegionaisSENAI getRegionaisSENAI() {

        return regionaisSENAI;
    }

    public void setRegionaisSENAI(RegionaisSENAI regionaisSENAI) {

        this.regionaisSENAI = regionaisSENAI;
    }

    public List<Trilhas> getTrilhas() {

        return trilhas;
    }

    public void setTrilhas(List<Trilhas> trilhas) {

        this.trilhas = trilhas;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" + idEmpresa +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", nomeFilial='" + nomeFilial + '\'' +
                ", segmentoEmpresa=" + segmentoEmpresa +
                ", cidade=" + cidade +
                ", estado=" + estado +
                ", regionaisSENAI=" + regionaisSENAI +
                ", trilhas=" + trilhas +
                '}';
    }
}
