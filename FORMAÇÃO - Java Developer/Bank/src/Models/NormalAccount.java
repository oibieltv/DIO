package Models;

public class NormalAccount extends BaseAccount{

    public NormalAccount(String _name , String _CPF, int _age, double _currency){
        this.name = _name;
        this.cpf = _CPF;
        this.age = _age;
        this.currency = _currency;
    }

    public void transfer(double _value){
        
    }
}