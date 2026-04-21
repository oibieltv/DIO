import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // out message > 

        // "Olá [Nome Cliente], 
        // obrigado por criar uma conta em nosso banco, 
        // sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque

        int accountNumber;
        String accountAgency, clientName;
        double clientCurrency;

        Scanner scan = new Scanner(System.in);

        System.out.print("Seja bem vindo! Para criar sua conta, digite seu nome: ");
        clientName = scan.nextLine();

        System.out.print("Agora o número de sua conta: ");
        accountNumber = scan.nextInt();

        // --- CLEANING BUFFER ---
        scan.nextLine();

        System.out.print("Quase lá! Agora sua agência: ");
        accountAgency = scan.nextLine();

        System.out.print("Para finalizar, seu saldo: ");
        clientCurrency = scan.nextDouble();

        System.out.println(
            "Olá " + clientName + 
            ", obrigado por criar uma conta em nosso banco, sua agência" +
            " é " + accountAgency + ", conta " + accountNumber +  " e seu saldo R$" + clientCurrency + " já está disponível para saque");
    }
}
