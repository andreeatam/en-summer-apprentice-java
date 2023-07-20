package com.example.practicaProiect.repository;

import com.example.practicaProiect.model.TicketCategory;
import com.example.practicaProiect.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

    //List<User> findAllUsersByID(Integer userID);
}
