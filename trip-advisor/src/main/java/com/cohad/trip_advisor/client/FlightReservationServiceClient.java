package com.cohad.trip_advisor.client;

import com.cohad.trip_advisor.dto.FlightReservationRequest;
import com.cohad.trip_advisor.dto.FlightReservationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.client.RestClient;

@RequiredArgsConstructor
public class FlightReservationServiceClient {
    private final RestClient restClient;

    public FlightReservationResponse reserve(FlightReservationRequest request) {
        return this.restClient.post()
                .body(request)
                .retrieve()
                .body(FlightReservationResponse.class);
    }
}
