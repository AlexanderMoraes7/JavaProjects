import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
  public static void main(String[] args) throws Exception {
    ContaTerminal conta = new ContaTerminal();
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Olá! Digite o número da Agência:");
      conta.Agencia = scanner.next();

      System.out.println("Digite o número da Conta:");
      conta.Numero = scanner.nextInt();

      System.out.println("Digite o nome do cliente:");
      conta.NomeCliente = scanner.next();

      System.out.println("Digite o Saldo que deseja depositar:");
      conta.Saldo = scanner.nextDouble();

      scanner.close();
      System.out.println("Olá " +conta.NomeCliente+ ", obrigado por "+
        "criar uma conta em nosso banco, sua agência é " +conta.Agencia+
        ", conta " +conta.Numero+ " e seu saldo " +conta.Saldo+ " já está disponível para saque");

  }
}


// .
