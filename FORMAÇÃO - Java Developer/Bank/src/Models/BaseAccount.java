package Models;

import Interface.AccountMethods;
import java.util.ArrayList;

public abstract class BaseAccount implements AccountMethods{
    protected String name, cpf;
    protected int age;
    protected double currency;
    protected ArrayList<ArrayList<Object>> history = new ArrayList<>();





    // CONSTRUCTORS
    void BaseAccount(){
        this.name = "";
        this.cpf = "";
        this.age = -1;
        this.currency = 0.0;
    }

    void BaseAccount(String _name , String _CPF, int _age, double _currency){
        this.name = _name;
        this.cpf = _CPF;
        this.age = _age;
        this.currency = _currency;
    }


    @Override
    public String getName(){ return this.name; }
    @Override
    public int getAge(){ return this.age; }
    @Override
    public String getCPF(){ return this.cpf; }

    @Override
    public void showHistory() {
        System.out.println("HISTORICO DE TRANSAÇÕES: \n");

        for(Object transaction : history){
            ArrayList<Object> line = (ArrayList<Object>) transaction;
            System.out.println("Tipo: " + line.get(0) + " | Valor: R$ " + line.get(1));
        }

        System.out.println("\nFIM DO HISTÓRICO");
    }
    @Override
    public void addTransaction(String _type, double _value) {
        ArrayList<Object> line = new ArrayList<>();

        line.add(_type);
        line.add(_value);

        history.add(line);
    }

    @Override
    public void deposit(double _value) {
        if(!"".equals(this.name)){
            this.currency += _value;
            addTransaction("deposit", _value);
        }
        else System.out.println("Usuário não cadastrado!");
    }

    @Override
    public void withdrawal(double _value) {
        if(!"".equals(this.name)){
            this.currency -= _value;
            addTransaction("withdrawal", _value);
        }
        else System.out.println("Usuário não cadastrado!");
    }
}
