package entities;

import entities.internet.Internet;
import entities.ipod.Ipod;
import entities.phone.Phone;

public class Iphone implements Ipod, Phone, Internet {
    @Override
    public void navegarNaWeb(String url) {
        System.out.println("Entrando em uma página Web  URL:" + url);
    }

    @Override
    public void fecharPaginaWeb() {
        System.out.println("Fechando a página Web atual...");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando Música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a Música...");
    }

    @Override
    public void proximaMusica() {
        System.out.println("Pulando para a próxima Música...");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Voltando para a Música anterior...");
    }

    @Override
    public void addMusicaNaListaDeMusicas() {
        System.out.println("Adicionando Música na lista de Músicas...");
    }

    @Override
    public void excluirMusicaDaListaDeMusicas() {
        System.out.println("Excluindo Música na lista de Músicas...");
    }

    @Override
    public void fazerLigacao() {
        System.out.println("Iniciando uma chamada...");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo uma chamada...");
    }

    @Override
    public void finalizarChamada() {
        System.out.println("Finalizando uma chamada...");
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem de texto...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem...");
    }

    @Override
    public void addContato() {
        System.out.println("Adicionando contato...");
    }

    @Override
    public void removerContato() {
        System.out.println("Removendo contato...");
    }
}

