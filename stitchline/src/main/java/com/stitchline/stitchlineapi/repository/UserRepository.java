package com.stitchline.stitchlineapi.repository;

import com.stitchline.stitchlineapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    @Query("{'name':?0")
   Optional<User> findByName(String name);
}
