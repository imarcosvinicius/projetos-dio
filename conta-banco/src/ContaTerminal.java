import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);
        System.out.println(" ========= CADASTRO BANCARIO ========= ");
        System.out.println("\nPara poder te cadastrar precisaremos que informe os dados abaixo:\n");
        System.out.print("Informe seu nome: \n");
        nomeCliente = sc.nextLine();

        System.out.print("Informe a agência: \n");
        agencia = sc.nextLine();

        System.out.print("Informe o número da conta: \n");
        conta = sc.nextInt();

        System.out.print("Informe o valor do primeiro depósito: \n");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, conta, saldo);

    }

}
