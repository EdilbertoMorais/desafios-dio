/**
 * Criei uma variação do desafio proposto, usando um loop while (true) para continuar pedindo os parâmetros até que eles sejam válidos.
 * Se a exceção for lançada, o programa imprimirá a mensagem de erro e solicitará os parâmetros novamente.
 * Se os parâmetros forem válidos, o loop será interrompido com break, e a contagem será realizada.
 * Isso garantirá que o usuário seja solicitado repetidamente até que os parâmetros corretos sejam fornecidos,
 * evitando a interrupção do programa.
 */

import java.util.Scanner;

public class Contador2 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm, parametroDois;

        while (true) {
            try {
                System.out.print("Digite o primeiro parâmetro: ");
                parametroUm = terminal.nextInt();
                System.out.print("Digite o segundo parâmetro: ");
                parametroDois = terminal.nextInt();

                contar(parametroUm, parametroDois);

                // Se a execução chegar aqui, os parâmetros foram válidos e a contagem foi concluída.
                break; // Sair do loop

            } catch (ParametrosInvalidosException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    // Métodos auxiliares
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
