package com.backend.roin_engineer.redis.repository;

import com.backend.roin_engineer.redis.model.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
