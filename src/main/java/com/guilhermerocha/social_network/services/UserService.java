package com.guilhermerocha.social_network.services;

import com.guilhermerocha.social_network.model.DTO.UserDTO;
import com.guilhermerocha.social_network.model.User;
import com.guilhermerocha.social_network.repository.UserRepository;
import com.guilhermerocha.social_network.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    private String id;

    public List<User> findAll(){
        List<User> users = repo.findAll();
        return users;
    }

    public User findById(String id) {
        this.id = id;
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        findById(id);
        repo.deleteById(id);
    }
    
    public User update(User obj) {
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public User FromDTO(UserDTO objDTO){
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }

    public User fromDTO(UserDTO objDTO) {
        return null;
    }
}
