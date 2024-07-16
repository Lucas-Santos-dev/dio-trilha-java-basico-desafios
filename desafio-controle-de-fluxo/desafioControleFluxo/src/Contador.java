import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
            
            // Imprimindo os números
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println("Imprimindo o número " + i);
            }
            
        } catch (Exception e) {
            // Imprimir a mensagem de erro caso ocorra uma exceção
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } finally {
            terminal.close(); // Fechar o scanner
        }
    }

    // Método para contar
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    // Definir exceção personalizada
    static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }
}
