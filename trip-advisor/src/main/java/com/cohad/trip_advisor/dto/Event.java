package com.cohad.trip_advisor.dto;

import java.time.LocalDate;

public record Event(String name,
                    String desription,
                    LocalDate date) {
}
