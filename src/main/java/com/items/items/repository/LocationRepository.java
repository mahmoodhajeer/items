package com.items.items.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.items.items.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}

