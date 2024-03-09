package com.backend.roin_engineer.redis.model.entity;

import com.backend.roin_engineer.redis.model.enums.BookingStatusType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String clientRequestId;

    @NonNull
    private Long flightId;

    @NonNull
    private Long seatId;

    @NonNull
    @Enumerated(EnumType.STRING)
    private BookingStatusType status;
}