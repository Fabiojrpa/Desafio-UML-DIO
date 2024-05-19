package internet;

public class NavegadorSafari implements NavegadorInternet {

    public void exibirPaginas(String url) {
        System.out.println(url);
    }
    public void adionarNovaAba(){
        System.out.println("Nova aba Adicionada");
    }
    public void AtualizarPagina(){
        System.out.println("Pagina Atualizada");
    }
}
