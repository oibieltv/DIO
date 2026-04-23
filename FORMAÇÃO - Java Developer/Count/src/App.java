import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int firstParam, secondParam;

        System.out.print("Digite o primeiro parâmetro: ");
        firstParam = scan.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        secondParam = scan.nextInt();


         try{
            count(firstParam, secondParam);
         }
         catch(ParametrosInvalidosException e){
            e.printStackTrace();
         }

         scan.close();
    }

    private static void count(int _firstParam, int _secondParam) throws ParametrosInvalidosException{
        if(_firstParam < _secondParam){
            int i = _secondParam - _firstParam;

            int count = 1;
            while(count <= i){
                System.out.println(count);
                count++;
            }
        }
        else throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }
}
