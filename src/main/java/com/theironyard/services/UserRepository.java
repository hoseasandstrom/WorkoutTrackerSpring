package com.theironyard.services;

import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hoseasandstrom on 7/1/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByName(String username);

}
