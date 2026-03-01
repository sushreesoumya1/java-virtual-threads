package com.cohad.trip_advisor.dto;

import java.util.List;

public record LocalRecomendations(List<String> restaurants,
                                  List<String> sightSeeing) {
}
