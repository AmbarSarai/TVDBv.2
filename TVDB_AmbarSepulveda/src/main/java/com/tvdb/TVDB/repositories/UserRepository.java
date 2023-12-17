package com.tvdb.TVDB.repositories;

import org.h2.engine.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    Object save(com.tvdb.TVDB.models.User b);
}