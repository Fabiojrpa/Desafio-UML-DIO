package aparelhos;

import internet.NavegadorInternet;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    public void SelecionarMusica(String musica) {
        System.out.println(musica);
    }

    public void pausar() {
        System.out.println("Musica Pausada!");
    }

    public void tocar() {
        System.out.println("Musica Tocando");
    }
    public void exibirPaginas(String url) {
        System.out.println(url);
    }
    public void adionarNovaAba(){
        System.out.println("Nova aba Adicionada");
    }
    public void AtualizarPagina(){
        System.out.println("Pagina Atualizada");
    }
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Alõ!!");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio iniciado");
    }
}
