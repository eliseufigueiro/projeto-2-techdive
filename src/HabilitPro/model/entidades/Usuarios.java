package HabilitPro.model.entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {

    public static long contadorIdUsuario = 0;//Apenas para teste, idAvaliacao será autoincremento no banco de dados
    private long idUsuario;
    private String nomeUsuario;
    private String cpf;
    private String email;
    private String senha;
    private List<Perfil> perfilList = new ArrayList<>();

    public Usuarios(String nomeUsuario, String cpf, String email, String senha, List<Perfil> perfilList) {
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
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

    public List<Perfil> getPerfilList() {
        return perfilList;
    }

    public void setPerfilList(List<Perfil> perfilList) {
        this.perfilList = perfilList;
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
