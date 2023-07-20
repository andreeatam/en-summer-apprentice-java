package com.example.practicaProiect.repository;

import com.example.practicaProiect.model.User;
import com.example.practicaProiect.model.Venue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VenueRepository extends CrudRepository<Venue,Integer> {

    //List<Venue> findAllVenuesByID(Integer venueID);
}
