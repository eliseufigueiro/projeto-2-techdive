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
}
