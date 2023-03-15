package com.location.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.location.entities.Locations;
import com.location.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationRepo;
	
	@Override
	public void saveLocation(Locations location) {
		locationRepo.save(location);
	}

	@Override
	public List<Locations> getLocationData() {
			List<Locations> findAll = locationRepo.findAll();
		return findAll;
	}

	@Override
	public void deleteLocation(long id) {
		locationRepo.deleteById(id);
	}

	@Override
	public Locations updateLocation(long id) {
		Optional<Locations> findById = locationRepo.findById(id);
		Locations locations = findById.get();
		return locations;
	}

	

}
