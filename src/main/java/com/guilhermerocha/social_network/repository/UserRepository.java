package com.guilhermerocha.social_network.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.guilhermerocha.social_network.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
