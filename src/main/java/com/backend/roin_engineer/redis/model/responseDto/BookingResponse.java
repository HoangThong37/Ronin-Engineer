package com.backend.roin_engineer.redis.model.responseDto;

import com.backend.roin_engineer.redis.model.entity.Booking;
import com.backend.roin_engineer.redis.model.enums.BookingStatusType;

public class BookingResponse {

    private Long bookingId;
    private String flightId;
    private String seatId;
    private BookingStatusType bookingStatusType;

    public BookingResponse(Long id, Long flightId, Long seatId, BookingStatusType status, String clientRequestId) {
    }

    public static BookingResponse of(Booking booking, String clientRequestId) {
        return new BookingResponse(booking.getId(), booking.getFlightId(), booking.getSeatId(),
                                   booking.getStatus(), clientRequestId);
    }
}
