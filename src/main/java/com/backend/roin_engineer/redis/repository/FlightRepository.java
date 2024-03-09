package com.backend.roin_engineer.redis.repository;

import com.backend.roin_engineer.redis.model.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}