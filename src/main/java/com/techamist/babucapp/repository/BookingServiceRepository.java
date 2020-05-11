package com.techamist.babucapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techamist.babucapp.model.Service;

@Repository
public interface BookingServiceRepository extends JpaRepository<Service, Long>{

}
