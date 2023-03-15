package com.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.location.entities.Employee;
import com.location.entities.Locations;

@Repository
public interface LocationRepository extends JpaRepository<Locations, Long> {

	//void save(Employee emp);

}
