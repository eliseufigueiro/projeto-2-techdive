package HabilitPro.model.entidades;

import HabilitPro.model.enums.Enum;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class Trilhas {

    public static long contadorIdTrilha = 0;//Contador para testes, simular chave auto incremento no banco de dados
    private long idTrilha;
    private Empresa empresa;
    private Ocupacao ocupacao;
    private String nomeTrilha;
    private String apelidoTrilha;
    private List<Modulos> modulos = new ArrayList<>();
    private Integer satisfacaoGeral;
    private String anotacoes;
    private Enum avaliacaoGeral = Enum.NAO;
    private Usuarios usuario;
    private OffsetDateTime anoAtual = OffsetDateTime.now();

    public Trilhas(Ocupacao ocupacao) {
        this.idTrilha = ++contadorIdTrilha;
        this.ocupacao = ocupacao;
        setaNomeTrilha();
        setaApelidoTrilha();
    }

    public Trilhas(Empresa empresa, Ocupacao ocupacao) {
        this.idTrilha = ++contadorIdTrilha;
        this.empresa = empresa;
        this.ocupacao = ocupacao;
        setaNomeTrilha();
        setaApelidoTrilha();
    }

    public long getIdTrilha() {

        return idTrilha;
    }

    public Empresa getEmpresa() {

        return empresa;
    }

    public void setEmpresa(Empresa empresa) {

        this.empresa = empresa;
    }

    public Ocupacao getOcupacao() {

        return ocupacao;
    }

    public void setOcupacao(Ocupacao ocupacao) {

        this.ocupacao = ocupacao;
    }

    public String getNomeTrilha() {

        return nomeTrilha;
    }

    public String getApelidoTrilha() {

        return apelidoTrilha;
    }

    public List<Modulos> getModulos() {

        return modulos;
    }

    public void setModulos(List<Modulos> modulos) {

        this.modulos = modulos;
    }

    public Integer getSatisfacaoGeral() {

        return satisfacaoGeral;
    }

    public void setSatisfacaoGeral(Integer satisfacaoGeral) {

        if (satisfacaoGeral < 1 || satisfacaoGeral > 5) {
            throw new IllegalArgumentException("Valor da Satisfação Geral inválido.");
        } else {
            this.satisfacaoGeral = satisfacaoGeral;
        }
    }

    public String getAnotacoes() {

        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {

        if (avaliacaoGeral == Enum.SIM && usuario.getPerfilList().equals("Operacional")) {
            this.anotacoes = anotacoes;
        }
    }

    public Usuarios getUsuario() {

        return usuario;
    }

    public void setUsuario(Usuarios usuario) {

        this.usuario = usuario;
    }

    //Método para habilitar a Avaliação Geral da Trilha
    public void avaliacaoGeralTrilha() {

    }

    //Método para setar o nome da Trilha
    public void setaNomeTrilha() {

        this.nomeTrilha = ocupacao.getOcupacao() + empresa.getNomeEmpresa() + ocupacao.getIdOcupacao() + empresa.getIdEmpresa() + anoAtual.getYear();
    }

    public void setaApelidoTrilha() {

        this.apelidoTrilha = ocupacao.getOcupacao() + ocupacao.getIdOcupacao() + empresa.getIdEmpresa();
    }

    @Override
    public String toString() {
        return "Trilhas{" +
                "idTrilha=" + idTrilha +
                ", empresa=" + empresa +
                ", ocupacao=" + ocupacao +
                ", nomeTrilha='" + nomeTrilha + '\'' +
                ", apelidoTrilha='" + apelidoTrilha + '\'' +
                ", modulos=" + modulos +
                ", satisfacaoGeral=" + satisfacaoGeral +
                ", anotacoes='" + anotacoes + '\'' +
                ", anoAtual=" + anoAtual +
                '}';
    }
}
