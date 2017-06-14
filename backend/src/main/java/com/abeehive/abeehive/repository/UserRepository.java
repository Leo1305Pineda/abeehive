package com.abeehive.abeehive.repository;

import org.springframework.data.repository.CrudRepository;

import com.abeehive.abeehive.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String name);
}

