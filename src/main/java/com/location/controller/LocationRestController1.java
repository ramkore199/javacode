package com.location.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entities.Locations;
import com.location.repository.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRestController1 {

	@Autowired
	private LocationRepository locationRepo;
	
	@GetMapping
	public List<Locations> getLocations() {
		List<Locations> locations = locationRepo.findAll();
		return locations;
		}
	
	@PostMapping
	public void saveLocations(@RequestBody Locations loca) {
		locationRepo.save(loca);
		}
	
	@PutMapping
	public void updateLocations(@RequestBody Locations loca) {
		locationRepo.save(loca);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteLocation(@PathVariable("id") long id) {
		locationRepo.deleteById(id);
	}
}
