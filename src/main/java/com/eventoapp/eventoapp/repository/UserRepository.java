package com.eventoapp.eventoapp.repository;


import org.springframework.data.repository.CrudRepository;

import com.eventoapp.eventoapp.model.User;


public interface UserRepository extends CrudRepository<User, Long> {

}