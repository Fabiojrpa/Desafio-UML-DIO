package aparelhos;

public class Ipod implements ReprodutorMusical {

    @Override
    public void SelecionarMusica(String musica) {
        System.out.println(musica);
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada!");
    }

    @Override
    public void tocar() {
        System.out.println("Musica Tocando");
    }
}
