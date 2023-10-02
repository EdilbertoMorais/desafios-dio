package entities;

public class Principal {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Métodos Interface INTERNET");
        iphone.navegarNaWeb("Teste");
        iphone.fecharPaginaWeb();
        System.out.println("___________________________________");

        System.out.println("Métodos Interface IPOD");
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.proximaMusica();
        iphone.voltarMusica();
        iphone.addMusicaNaListaDeMusicas();
        iphone.excluirMusicaDaListaDeMusicas();
        System.out.println("___________________________________");

        System.out.println("Métodos Interface PHONE");
        iphone.fazerLigacao();
        iphone.atenderChamada();
        iphone.finalizarChamada();
        iphone.enviarMensagem();
        iphone.receberMensagem();
        iphone.addContato();
        iphone.removerContato();
        System.out.println("___________________________________");
    }
}
