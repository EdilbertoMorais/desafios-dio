package entities.ipod;

import java.util.List;

public interface Ipod {

    public List<Musica> listaMusica = null;
    public default void tocarMusica() {
    }

    public default void pausarMusica() {
    }

    public default void proximaMusica() {
    }

    public default void voltarMusica() {
    }

    public default void addMusicaNaListaDeMusicas() {
    }

    public default void excluirMusicaDaListaDeMusicas() {
    }
}
