package HabilitPro.view;

import HabilitPro.model.entidades.*;
import HabilitPro.model.services.Avaliacao;
import HabilitPro.model.services.ValidarCNPJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Debug {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Lista para testes
        List<SegmentoEmpresa> segmentoEmpresaList = new ArrayList<>();
        List<Empresa> empresasList = new ArrayList<>();//DB para teste de empresas
        List<Avaliacao> avaliacaoList = new ArrayList<>();//DB para teste de avaliações

        //Cadastro Estados e Cidades para testes
        Estado estado = new Estado("Santa Catarina", "SC");
        Cidade cidade = new Cidade("Palhoça", estado);
        Cidade cidade1 = new Cidade("Florianópolis", estado);

        //Cadastro de Segmentos
        SegmentoEmpresa segmentoEmpresa = new SegmentoEmpresa("Alimentos e Bebidas");

        //Cadastro de Regionais
        RegionaisSENAI regionaisSENAI = new RegionaisSENAI("Norte - Nordeste");

        //Cadastro de Empresa
        Empresa empresa = new Empresa("iSolutec", "12345678900165", segmentoEmpresa, cidade, estado, regionaisSENAI);
        Empresa empresa1 = new Empresa("Nova Tech", "4561237890022", segmentoEmpresa, cidade, estado, regionaisSENAI);

        //Cadastro Ocupação
        Ocupacao ocupacao = new Ocupacao("Gerente");
        Ocupacao ocupacao1 = new Ocupacao("Dev");

        //Cadastro Trilha
        Trilhas trilhas = new Trilhas(empresa, ocupacao);
        Trilhas trilhas1 = new Trilhas(empresa, ocupacao1);

        //Cadastro Status
        StatusModulos statusModulos = new StatusModulos("Curso não iniciado", "Avaliação não deve estar disponível para aplicação.");

        //Cadastro Módulo
        Modulos modulo = new Modulos(trilhas, "TESTE", "Novo TESTE", statusModulos);

        //Cadastro Trabalhador
        List<Trilhas> trilhasList = new ArrayList<>();
        List<Modulos> modulosList = new ArrayList<>();

        modulosList.add(modulo);
        trilhas.setModulos(modulosList);
        trilhas1.setModulos(modulosList);
        trilhasList.add(trilhas);
        trilhasList.add(trilhas1);
        Trabalhador trabalhador = new Trabalhador("BOB", "78945612312", empresa, "Vendas", "Gerente", trilhasList);

        //Prints para teste relacionamento entre as Classes
        System.out.println(cidade);
        System.out.println(cidade1);
        System.out.println(empresa);
        System.out.println();
        System.out.println(trilhas);
        System.out.println(trilhas1);
        trilhas.setSatisfacaoGeral(5);//Imprime satisfação geral 5
        System.out.println(trilhas);//Imprime trilha após add satisfação geral 5
        System.out.println(trabalhador);

        trabalhador.setEmpresa(empresa1);

        System.out.println(trabalhador);

        ValidarCNPJ isValidar = new ValidarCNPJ();

        System.out.println(isValidar.isValidarEntradaCNPJ("30.290.317/0001-70"));
        System.out.println(isValidar.isValidarEntradaCNPJ("11.111.111/1111-11"));

        String CNPJ = "30.290.317/0001-70";
        if (isValidar.isValidarEntradaCNPJ(CNPJ)) {
            isValidar.isValidarCNPJ(CNPJ);
            System.out.println(isValidar.isValidarCNPJ(CNPJ));
            System.out.println(isValidar.isImprimirCNPJ("30290317000170"));
        }

    }
}
