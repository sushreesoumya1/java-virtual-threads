package com.cohad.trip_advisor.client;

import com.cohad.trip_advisor.dto.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestClient;

import java.util.List;

@RequiredArgsConstructor
public class EventServiceClient {

    private final RestClient restClient;

    public List<Event> getEvents(String airportCode){
        return this.restClient.get()
                .uri("{airprtCode}", airportCode)
                .retrieve()
                .body(new ParameterizedTypeReference<List<Event>>() {
                });
    }
}
