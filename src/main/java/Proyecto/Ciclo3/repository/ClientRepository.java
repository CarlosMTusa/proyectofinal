/*
 * 
 */
package Proyecto.Ciclo3.repository;

import Proyecto.Ciclo3.model.Client;
import Proyecto.Ciclo3.repository.crud.ClientCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class ClientRepository {
    
    @Autowired
    ClientCrudRepository clientCrudRepository;
    
    public List<Client>getAll(){
        return (List<Client>)clientCrudRepository.findAll();
        
    }

    public Optional<Client>getClient(int id){
        return clientCrudRepository.findById(id);
    }
    
    public Client save (Client clt){
        return clientCrudRepository.save(clt);
    }

    public void delete(Client clt){
        clientCrudRepository.delete(clt);
    }
        
}

