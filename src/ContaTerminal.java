import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da conta: ");
        short numeroConta = scanner.nextShort();

        System.out.println("Por favor, digite o número da Agência: ");
        String numeroAgencia = scanner.next();
        
        scanner.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor do depósito inicial: ");
        float saldo = scanner.nextFloat();
        

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," + 
            " sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo +
            " já está disponível para saque.");        

        scanner.close();
    }
}