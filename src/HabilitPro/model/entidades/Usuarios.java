package HabilitPro.model.entidades;

import HabilitPro.model.services.ValidarCPF;
import HabilitPro.model.services.ValidarEmail;
import HabilitPro.model.services.ValidarSenha;

import java.util.*;

public class Usuarios {

    public static long contadorIdUsuario = 0;//Apenas para teste, idAvaliacao será autoincremento no banco de dados
    private long idUsuario;
    private String nomeUsuario;
    private String cpf;
    private String email;
    private String senha;
    private Set<Perfil> perfilList;

    public Usuarios(String nomeUsuario, String cpf, String email, String senha, Set<Perfil> perfilList) {
        this.nomeUsuario = nomeUsuario;
        validarDados(cpf, email, senha);
        this.perfilList = perfilList;
    }

    public long getIdUsuario() {

        return idUsuario;
    }

    public String getNomeUsuario() {

        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {

        this.nomeUsuario = nomeUsuario;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getSenha() {

        return senha;
    }

    public void setSenha(String senha) {

        this.senha = senha;
    }

    public Set<Perfil> getPerfilList() {

        return perfilList;
    }

    public void validarDados(String cpf, String email, String senha) {

        ValidarCPF validarCPF = new ValidarCPF();
        ValidarEmail validarEmail = new ValidarEmail();
        ValidarSenha validarSenha = new ValidarSenha();

        if (validarCPF.isValidarEntradaCPF(cpf)) {
            if (validarCPF.isValidarCPF(cpf)) {
                this.cpf = cpf;
            } else {
                throw new IllegalArgumentException("Erro: CPF inválido");
            }
        } else {
            throw new IllegalArgumentException("Erro: CPF inválido");
        }

        if (validarEmail.isValidarEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Erro: E-mail inválido");
        }

        if (validarSenha.isValidarSenha(senha)) {
            this.senha = senha;
        } else {
            throw new IllegalArgumentException("Erro: Senha inválido");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuarios usuarios = (Usuarios) o;
        return perfilList.equals(usuarios.perfilList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(perfilList);
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "idUsuario=" + idUsuario +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", perfilList=" + perfilList +
                '}';
    }
}
