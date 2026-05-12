package Controller;

import Models.BaseAccount;
import Repository.BankRepository;

public class Bank {
    BankRepository repository = new BankRepository();

    public void addClient(BaseAccount _client){
        repository.addClient(_client);
    }

    public BaseAccount getClient(String _userName){
        return repository.getClient(_userName);
    }

    public boolean searchClient(String _userName){
        return repository.searchClient(_userName);
    }
}
