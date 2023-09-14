package one.digitalinovation.laboojava.negocio;

import one.digitalinovation.laboojava.basedados.Banco;
import one.digitalinovation.laboojava.entidade.Cliente;
import one.digitalinovation.laboojava.entidade.Produto;

import java.lang.ref.Cleaner;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * Classe para manipular a entidade {@link Cliente}.
 * @author thiago leite
 */
public class ClienteNegocio {

    /**
     * {@inheritDoc}.
     */
    private Banco bancoDados;

    /**
     * Construtor.
     * @param banco Banco de dados para ter acesso aos clientes cadastrados
     */
    public ClienteNegocio(Banco banco) {
        this.bancoDados = banco;
    }

    /**
     * Consulta o cliente pelo seu CPF.
     * @param cpf CPF de um cliente
     * @return O cliente que possuir o CPF passado.
     */
    public Optional<Cliente> consultar(String cpf) {
        // Itera pela lista de clientes para encontrar o cliente com o CPF correspondente
        for (Cliente cliente : bancoDados.getClientes()) {
            if (cliente.getCpf().equals(cpf)) {
                return Optional.of(cliente); // Retorna o cliente encontrado
            }
        }
        return Optional.empty(); // Retorna um Optional vazio se o cliente não for encontrado
    }

    /**
     * Cadastra um novo cliente.
     * @param cliente Novo cliente que terá acesso à aplicação
     */
   public void cadastrarCliente(String cpf, String nome){
       Cliente novoCliente = new Cliente(cpf, nome);
       bancoDados.adicionarCliente(novoCliente);
   }

    /**
     * Exclui um cliente específico.
     * @param cpf CPF do cliente
     */
    public void excluirCliente(String cpf) {
        // Obtém a lista de clientes do banco de dados
        List<Cliente> clientes = List.of(bancoDados.getClientes());

        // Itera pela lista de clientes para encontrar o cliente com o CPF correspondente
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getCpf().equals(cpf)) {
                iterator.remove(); // Remove o cliente da lista
                return; // Sai do método após encontrar e remover o cliente
            }
        }
    }


}
