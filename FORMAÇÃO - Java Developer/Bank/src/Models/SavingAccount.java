package Models;

public class SavingAccount extends BaseAccount{

    public SavingAccount(String _name , String _CPF, int _age, double _currency){
        this.name = _name;
        this.cpf = _CPF;
        this.age = _age;
        this.currency = _currency;
    }

    public void save(double _value){

    }

    public void takeSave(double _value){

    }
}