package Repository;

import Models.BaseAccount;
import java.util.ArrayList;

public class BankRepository{
    ArrayList<BaseAccount> clients = new ArrayList<BaseAccount>();

    public void addClient(BaseAccount _client){ this.clients.add(_client); };

    public void deleteClient(BaseAccount _client){ this.clients.remove(this.clients.indexOf(_client)); };
    public void deleteClient(int _index){ this.clients.remove(_index); };

    public BaseAccount geClient(int _index){ return clients.get(_index); };
}