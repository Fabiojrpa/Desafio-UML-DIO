package aparelhos;

public class Telefone implements AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Ligando para: ");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Ligando para: ");
    }
}
