package org.publicissapient.trip.service;

import java.util.List;
import java.util.Optional;

import org.publicissapient.trip.entity.Trip;
import org.springframework.stereotype.Service;

@Service
public interface ITripService {

	Trip createTrip(String name, int numberOfDays);

	Optional<Trip> getTripById(String id);
	
	List<Trip> getAllTrips();
}
