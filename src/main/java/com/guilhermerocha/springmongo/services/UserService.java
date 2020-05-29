package com.guilhermerocha.springmongo.services;

import com.guilhermerocha.springmongo.domain.User;
import com.guilhermerocha.springmongo.repository.UserRepository;
import com.guilhermerocha.springmongo.services.exception.ObjectNotFoundException;
import com.guilhermerocha.springmongo.userDTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
    public User findById(String id) {
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

    public User FromDTO(UserDTO objDTO){
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }

    public User fromDTO(UserDTO objDTO) {
        return null;
    }
}
