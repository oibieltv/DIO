package Controller;

import Models.BaseAccount;
import Repository.BankRepository;

public class Bank {
    BankRepository repository = new BankRepository();

    public void addClient(BaseAccount _client){
        repository.addClient(_client);
    }
}
