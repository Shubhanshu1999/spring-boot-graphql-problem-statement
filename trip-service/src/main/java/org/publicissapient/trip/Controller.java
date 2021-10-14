package org.publicissapient.trip;

import java.util.List;

import org.publicissapient.trip.entity.Trip;
import org.publicissapient.trip.service.ITripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	ITripService tripService;
	
	@GetMapping("/all-trips")
	public List<Trip> getAllTrips() {
		return tripService.getAllTrips();
	}
}
