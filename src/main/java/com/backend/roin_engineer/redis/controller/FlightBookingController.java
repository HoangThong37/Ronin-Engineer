package com.backend.roin_engineer.redis.controller;

import com.backend.roin_engineer.redis.model.requestDto.BookingRequest;
import com.backend.roin_engineer.redis.model.responseDto.BookingResponse;
import com.backend.roin_engineer.redis.service.BookingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
public class FlightBookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping
    public ResponseEntity<BookingResponse> booking(@RequestBody BookingRequest request) {
        return ResponseEntity.ok(bookingService.getBooking(request));
    }
}
