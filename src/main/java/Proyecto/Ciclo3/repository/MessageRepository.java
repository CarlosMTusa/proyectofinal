/*
 * 
 */
package Proyecto.Ciclo3.repository;

import Proyecto.Ciclo3.model.Message;
import Proyecto.Ciclo3.repository.crud.MessageCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class MessageRepository {
    
    @Autowired
    MessageCrudRepository messageCrudRepository;
    
    public List<Message>getAll(){
        return (List<Message>)messageCrudRepository.findAll();
        
    }

    public Optional<Message>getMessage(int id){
        return messageCrudRepository.findById(id);
    }
    
    public Message save (Message msg){
        return messageCrudRepository.save(msg);
    }

    public void delete(Message msg){
        messageCrudRepository.delete(msg);
    }
    

}
