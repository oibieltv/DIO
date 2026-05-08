package View;

import Controller.Bank;
import Models.NormalAccount;
import Models.SavingAccount;
import Utils.Cleaner;
import java.util.Scanner;

public class BankMenu {
    Scanner scan = new Scanner(System.in);
    Bank bankInstance = new Bank();

    public void Run(){
        Cleaner.clear();

        String greeting = "Seja bem vindo ao serviços bancário OiBielBank!\n" ;
        String menu = "O que deseja fazer agora? \n[1] Acessar conta\n[2] Criar conta \n[0] Fechar App\n\nDigite aqui: ";
        
        
        System.out.println(greeting);

        int firstOpt = -1;
        OUTER:
        while (firstOpt != 0) {
            System.out.printf(menu);
            firstOpt = scan.nextInt();

            switch (firstOpt) {
                case 0 -> {
                    break OUTER;
                }
                case 1 -> loginAccount();
                case 2 -> createAccount();
                default -> System.out.println("Opção Inválida!");
            }

            Cleaner.clear();
        }


        scan.close();
    }

    private boolean loginAccount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'startApp'");
    }

    private void createAccount() {
        String tempName, tempCPF;
        int tempAge;

        Cleaner.clear();

        String prompt = 
        """
        Vamos entao, seguir 4 passos para a criacao de sua conta -> 
        1 - Seu nome;
        2 - Seu CPF;
        3 - Sua Idade;
        4 - O tipo de conta.
        
        """;

        System.out.println(prompt);

        prompt = "1 - Digite seu nome completo: ";
        System.out.print(prompt);
        tempName = scan.nextLine();
        scan.next();

        prompt = "2 - Digite seu CPF (Apenas números): ";
        System.out.print(prompt);
        tempCPF = scan.nextLine();
        scan.next();

        prompt = "3 - Digite sua idade: ";
        System.out.print(prompt);
        tempAge = scan.nextInt();

        prompt = 
        """
        4 - Para finalizar, o tipo de conta -> 

        [1] Conta corrente
        [2] Conta Poupanca
        
        """;
        System.out.print(prompt);

        OUTER:
        while (true) { 
            System.out.print("Digite aqui: ");
            int opt = scan.nextInt();

            switch (opt) {
                case 1 -> {
                    bankInstance.addClient(new NormalAccount(tempName, tempCPF, tempAge, 0.0d));
                    System.out.println("Criando conta corrente"); 

                    break OUTER;
                }
                case 2 -> {
                    bankInstance.addClient(new SavingAccount(tempName, tempCPF, tempAge, 0.0d));
                    System.out.println("Criando conta poupança"); 
                    break OUTER;
                }
                default -> System.out.println("\nOpção Inválida!");
            }
        }
    }

}
