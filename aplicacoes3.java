package iPhone.ReprodutorMusical;

public class aplicacoes3 implements ReprodutorMusical {
    @Override
    public void tocar(){
        System.out.println("Insira aqui para tocar");
    }
    @Override
    public void pausar(){
        System.out.println("Digite aqui para pausar");
    }
    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecione sua musica");
        System.out.println(musica);

    }
}
