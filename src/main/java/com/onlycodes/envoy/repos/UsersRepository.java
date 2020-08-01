package com.onlycodes.envoy.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.onlycodes.envoy.models.Users;

public interface UsersRepository extends MongoRepository<Users, String> {
}