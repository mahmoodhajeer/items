package com.items.items.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.items.items.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{
	
}
