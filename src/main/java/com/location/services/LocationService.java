package com.location.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.location.entities.Locations;


@Service
public interface LocationService {

public void saveLocation(Locations location);

public List<Locations> getLocationData();

public void deleteLocation(long id);

public Locations updateLocation(long id);

}
