package iPhone.NavegadorNaInternet;

public class aplicacoes2 implements NavegadorNaInternet {
    @Override
    public void exibirPagina(String url){
        System.out.println("Aperte aqui para exibir página");
        System.out.println(url);
    }
    @Override
    public void adicionarNovaAba(){
        System.out.println("Insira aqui a nova aba");
    }
    @Override
    public void atualizarPagina(){
        System.out.println("Aperte aqui para atualizar a página");
    }
}
