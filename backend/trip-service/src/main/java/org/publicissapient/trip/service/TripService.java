package org.publicissapient.trip.service;

import java.util.List;
import java.util.Optional;

import org.publicissapient.trip.entity.Trip;
import org.publicissapient.trip.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripService implements ITripService{
	@Autowired
	TripRepository tripRepository;
	
	@Override
	public Trip createTrip(String name, int numberOfDays) {
		Trip trip = new Trip(name, numberOfDays);
		return tripRepository.save(trip);
	}

	@Override
	public Optional<Trip> getTripById(String id) {
		return tripRepository.findById(id);
	}

	@Override
	public List<Trip> getAllTrips() {
		return tripRepository.findAll();
	}
}
