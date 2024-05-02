import java.util.Scanner;
public class contaTerminal {
    public static void main(String[] args) throws Exception {
      
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Bem vindo ao ContaBanco");
        
        System.out.println("Dgite o numero da agenica");
        int numeroAgencia = scanner.nextInt();
     

        System.out.println("Digite o numero da conta");
        int numerodaConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do titular da conta");
        String nome = scanner.nextLine();

        System.out.println("Digite o saldo da conta");
        double saldoInicial = scanner.nextDouble();

        System.out.println("minha agencia " + numeroAgencia + " conta " + numeroAgencia + " nome "+ nome + " meu saldo é " + saldoInicial);
        
    }
}
