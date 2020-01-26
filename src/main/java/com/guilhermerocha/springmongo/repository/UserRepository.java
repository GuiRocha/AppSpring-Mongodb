package com.guilhermerocha.springmongo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.guilhermerocha.springmongo.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
