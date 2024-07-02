import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 2100.59;
        //Importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para os usuários e obter os valores digitados pelo usuário
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next(); 

        System.out.println("Por favor, digite o número da conta");
        int conta = scanner.nextInt();

        System.out.println("Digite seu nome para validarmos as informações:");
        String nome = scanner.next();    

        //Exibir a mensagem com os dados inseridos para o usuário
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta: " + conta + ", saldo: R$" + saldo + " já disponível para saque.");

        scanner.close();
    }
}
