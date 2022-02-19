package HabilitPro.view;

import HabilitPro.model.entidades.Cidade;
import HabilitPro.model.entidades.Empresa;
import HabilitPro.model.entidades.Estado;
import HabilitPro.model.services.Avaliacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Debug {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Lista para testes
        List<Empresa> empresas = new ArrayList<>();//DB para teste de empresas
        List<Avaliacao> avaliacaos = new ArrayList<>();//DB para teste de avaliações

        //Cadastro Estados e Cidades para testes
        Estado estado = new Estado("Santa Catarina", "SC");
        Cidade cidade = new Cidade("Palhoça", estado);
        Cidade cidade1 = new Cidade("Florianópolis", estado);

        //Teste TRILHA


        System.out.println(cidade);
        System.out.println(cidade1);
    }
}
