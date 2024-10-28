package iPhone.Uml;

import iPhone.AparelhoTelefonico.Aplicacoes;
import iPhone.NavegadorNaInternet.aplicacoes2;
import iPhone.ReprodutorMusical.aplicacoes3;

public class Uml {
    public static void main(String[] args) {

        System.out.println("APARELHO TELEFONICO");
        Aplicacoes aplicacoes = new Aplicacoes();
        aplicacoes.ligar("123-456-7890");
        aplicacoes.atender("não");
        aplicacoes.iniciarCorreioVoz("x");


        System.out.println("NAVEGADOR NA INTERNET");
        aplicacoes2 aplicacoes2 = new aplicacoes2();
        aplicacoes2.atualizarPagina();
        aplicacoes2.exibirPagina("https//Teste.com.br");
        aplicacoes2.adicionarNovaAba();

        System.out.println("REPRODUTOR MUSICAL");
        aplicacoes3 aplicacoes3 = new aplicacoes3();
        aplicacoes3.pausar();
        aplicacoes3.selecionarMusica("Evidencias");
        aplicacoes3.tocar();
    }
}