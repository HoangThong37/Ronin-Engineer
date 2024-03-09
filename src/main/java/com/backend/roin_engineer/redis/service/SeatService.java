package com.backend.roin_engineer.redis.service;

import com.backend.roin_engineer.redis.exception.ResourceNotFoundException;
import com.backend.roin_engineer.redis.model.entity.Seat;
import com.backend.roin_engineer.redis.repository.SeatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SeatService {

    private final SeatRepository seatRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void update(final Seat seat) {
        seatRepository.saveAndFlush(seat);
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
    public Seat getById(final Long id) {
        return seatRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Seat with id = %s not found".formatted(id)));
    }
}