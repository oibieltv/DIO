package Repository;

import Models.BaseAccount;
import java.util.ArrayList;

public class BankRepository{
    ArrayList<BaseAccount> clients = new ArrayList<BaseAccount>();

    public void addClient(BaseAccount _client){ this.clients.add(_client); };

    public void deleteClient(BaseAccount _client){ this.clients.remove(this.clients.indexOf(_client)); };
    public void deleteClient(int _index){ this.clients.remove(_index); };

    public BaseAccount getClient(int _index){ return clients.get(_index); };
    public BaseAccount getClient(String _name){ 

        for (BaseAccount c : clients) { if (c.getName().equals(_name)) return c; }

        return null; 
    }

    public boolean searchClient(String _userName) {
        boolean result = false;
        BaseAccount tempAccount = null;

        for (BaseAccount c : clients) { if (c.getName().equals(_userName)) tempAccount = c; }
        if (tempAccount != null) result = true;
        
        return result;
    };
}