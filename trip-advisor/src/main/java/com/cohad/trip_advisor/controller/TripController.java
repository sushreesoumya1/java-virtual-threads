package com.cohad.trip_advisor.controller;

import com.cohad.trip_advisor.dto.FlightReservationResponse;
import com.cohad.trip_advisor.dto.TripPlan;
import com.cohad.trip_advisor.dto.TripReservationRequest;
import com.cohad.trip_advisor.service.TripPlanService;
import com.cohad.trip_advisor.service.TripReservationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("trip")
public class TripController {

    private final TripPlanService planService;
    private final TripReservationService reservationService;

    public TripController(TripPlanService planService, TripReservationService reservationService) {
        this.planService = planService;
        this.reservationService = reservationService;
    }

    @GetMapping("{airportCode}")
    public TripPlan planTrip(@PathVariable String airportCode) {
        return this.planService.getTripPlan(airportCode);
    }

    @PostMapping("reserve")
    public FlightReservationResponse reserveFlight(@RequestBody TripReservationRequest request) {
        return this.reservationService.reserve(request);
    }
}
