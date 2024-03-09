package com.backend.roin_engineer.redis.model.requestDto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@Accessors(fluent = true)
public class BookingRequest {

    @NotNull
    private Long flightId;

    @NotNull
    private Long seatId;

    private String clientRequestId = UUID.randomUUID().toString();

    public String getLockKey() {
        return "booking::%d::%d::lock".formatted(this.flightId, this.seatId);
    }
}
