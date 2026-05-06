package Interface;

public interface AccountMethods {

    public String getName();
    public int getAge();
    public String getCPF();

    public void showHistory();
    public void addTransaction(String _type, double _value);

    public void deposit(double _value);
    public void withdrawal(double _value);

}

