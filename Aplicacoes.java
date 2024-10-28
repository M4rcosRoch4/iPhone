package iPhone.AparelhoTelefonico;

public class Aplicacoes implements AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Dígite para ligar");
        System.out.println("Você está ligando para " + numero + " aguarde");
    }

    @Override
    public void atender(String escolha) {
        System.out.println("Alguém está te ligando, dígite sim para atender ou não");
        if (escolha.equalsIgnoreCase("Sim")) {
            System.out.println("Chamada atendida");
        } else if (escolha.equalsIgnoreCase("Nao")) {
            System.out.println("Chamada recusada");
        } else if (escolha.equalsIgnoreCase("Não")) {
            System.out.println("Chamada recusada");
        } else {
            System.out.println("Escolha inválida");
        }
    }

    @Override
    public void iniciarCorreioVoz(String gravar) {
        System.out.println("Dígite gravar para mensagem de voz");
        if (gravar.equalsIgnoreCase("gravar")){
            System.out.println("Gravando");
        } else {
            System.out.println("Fechado");
        }
    }
}