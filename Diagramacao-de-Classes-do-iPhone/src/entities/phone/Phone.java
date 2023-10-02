package entities.phone;

import java.util.List;

public interface Phone {

    List<Contato>numeroTelefone = null;
    default void fazerLigacao() {
    }

    default void atenderChamada() {
    }

    default void finalizarChamada() {
    }

    default void enviarMensagem() {
    }

    default void receberMensagem() {
    }

    default void addContato() {
    }

    default void removerContato() {
    }
}
