package HabilitPro.view;

import HabilitPro.model.Modulos;
import HabilitPro.model.Trabalhador;
import HabilitPro.model.services.Avaliacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Debug {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Avaliacao> avaliacaos = new ArrayList<>();//DB para teste de avaliações

        //Debug avaliações
        Avaliacao avaliacao = new Avaliacao("Alguma coisa qualquer", 5, new Modulos(), new Trabalhador());
        System.out.println(avaliacao);
    }
}
