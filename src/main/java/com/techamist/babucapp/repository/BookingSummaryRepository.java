package com.techamist.babucapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techamist.babucapp.model.Summary;

@Repository
public interface BookingSummaryRepository extends JpaRepository<Summary, Long>{

}
