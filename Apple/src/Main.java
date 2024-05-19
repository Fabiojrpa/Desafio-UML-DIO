import aparelhos.Iphone;
import aparelhos.Telefone;

public class Main {

    public static void main(String[] args) {

        Telefone telefone = new Telefone();
        Iphone iphone = new Iphone();
        iphone.ligar("telefone");
        telefone.atender();

        telefone.ligar("Iphone");

    }
}