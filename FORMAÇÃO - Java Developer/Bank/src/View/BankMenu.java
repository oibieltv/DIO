package View;

import Utils.Cleaner;
import java.util.Scanner;

public class BankMenu {
    Scanner scan = new Scanner(System.in);

    public void Run(){


        String greeting = "Seja bem vindo ao serviços bancário OiBielBank!\n" ;
        String menu = "O que deseja fazer agora? \n[1] Acessar conta\n[0] Fechar App\n\nDigite aqui: ";
        
        System.out.println(greeting);

        int firstOpt = -1;
        while(firstOpt != 0){
            System.out.printf(menu);
            firstOpt = scan.nextInt();

            if(firstOpt == 0) break;
            else if(firstOpt == 1) startApp();
            else System.out.println("Opção Inválida!");

            Cleaner.clear();
        }


        scan.close();
    }

    private void startApp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'startApp'");
    }

}
