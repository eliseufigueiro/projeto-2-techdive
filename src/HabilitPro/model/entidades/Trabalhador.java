package HabilitPro.model.entidades;

import HabilitPro.model.services.*;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class Trabalhador {

    private static long contadorIdTtrabalhador = 0;//Apenas para teste, será autoencremento no banco de dados
    private long idTrabalhador;
    private String nomeTrabalhador;
    private String cpf;
    private Empresa empresa;
    private String setor;
    private String funcao;
    private OffsetDateTime dtAlteracaoFuncao;
    private List<Trilhas> trilhasList = new ArrayList<>();
    private List<Avaliacao> avaliacaoList = new ArrayList<>();
    private static List<Historico> historicoList = new ArrayList<>();

    public Trabalhador(String nomeTrabalhador, String cpf, Empresa empresa, String setor, String funcao, List<Trilhas> trilhasList) {
        this.idTrabalhador = ++contadorIdTtrabalhador;
        this.nomeTrabalhador = nomeTrabalhador;
        validarDados(cpf);
        this.empresa = empresa;
        this.setor = setor;
        this.funcao = funcao;
        this.dtAlteracaoFuncao = OffsetDateTime.now();
        if (trilhasList.isEmpty()) {
            throw new NullPointerException("Não há Trilhas cadastradas, é necessário uma Trilha contendo um Módulo pelo menos.");
        } else {
            for (Trilhas t : trilhasList) {
                if (t.getModulos().isEmpty()) {
                    throw new NullPointerException("Não há Módulos cadastrados, é necessário um Módulo pelo menos.");
                }
            }
            this.trilhasList = trilhasList;
        }
        addHistorico();
    }

    public long getIdTrabalhador() {

        return idTrabalhador;
    }

    public String getNomeTrabalhador() {

        return nomeTrabalhador;
    }

    public void setNomeTrabalhador(String nomeTrabalhador) {

        this.nomeTrabalhador = nomeTrabalhador;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public Empresa getEmpresa() {

        return empresa;
    }

    public void setEmpresa(Empresa empresa) {

        this.empresa = empresa;
        addHistorico();
    }

    public String getSetor() {

        return setor;
    }

    public void setSetor(String setor) {

        this.setor = setor;
        addHistorico();
    }

    public String getFuncao() {

        return funcao;
    }

    public void setFuncao(String funcao) {

        this.funcao = funcao;
        addHistorico();
    }

    public OffsetDateTime getDtAlteracaoFuncao() {

        return dtAlteracaoFuncao;
    }

    public void setDtAlteracaoFuncao(OffsetDateTime dtAlteracaoFuncao) {

        this.dtAlteracaoFuncao = dtAlteracaoFuncao;
    }

    public List<Trilhas> getTrilhasList() {

        return trilhasList;
    }

    public void setTrilhasList(List<Trilhas> trilhasList) {

        this.trilhasList = trilhasList;
    }

    public List<Avaliacao> getAvaliacaoList() {

        return avaliacaoList;
    }

    public void setAvaliacaoList(List<Avaliacao> avaliacaoList) {

        this.avaliacaoList = avaliacaoList;
    }

    public List<Historico> getHistoricoList() {

        return historicoList;
    }

    public void setHistoricoList(List<Historico> historicoList) {

        this.historicoList = historicoList;
    }

    public void validarDados(String cpf) {

        ValidarCPF validarCPF = new ValidarCPF();

        if (validarCPF.isValidarEntradaCPF(cpf)) {
            if (validarCPF.isValidarCPF(cpf)) {
                this.cpf = cpf;
            } else {
                throw new IllegalArgumentException("Erro: CPF inválido");
            }
        } else {
            throw new IllegalArgumentException("Erro: CPF inválido");
        }
    }

    //Método para setar Histórico
    public void addHistorico() {

        for (Trilhas t : trilhasList) {
            Historico historico = new Historico(empresa.getIdEmpresa(), t.getIdTrilha(), setor, funcao);
            historicoList.add(historico);
        }
    }

    @Override
    public String toString() {
        return "Trabalhador{" +
                "idTrabalhador=" + idTrabalhador +
                ", nomeTrabalhador='" + nomeTrabalhador + '\'' +
                ", cpf='" + cpf + '\'' +
                ", empresa=" + empresa +
                ", setor='" + setor + '\'' +
                ", funcao='" + funcao + '\'' +
                ", dtAlteracaoFuncao=" + dtAlteracaoFuncao +
                ", trilhasList=" + trilhasList.size() +
                ", avaliacaoList=" + avaliacaoList +
                ", historicoList=" + historicoList +
                '}';
    }
}
