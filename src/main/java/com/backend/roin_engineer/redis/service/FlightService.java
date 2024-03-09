package com.backend.roin_engineer.redis.service;

import com.backend.roin_engineer.redis.exception.ResourceNotFoundException;
import com.backend.roin_engineer.redis.model.entity.Flight;
import com.backend.roin_engineer.redis.repository.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;

    @Transactional(readOnly = true)
    public Flight getById(final Long id) {
        return flightRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Flight with id = %s not found".formatted(id)));
    }
}