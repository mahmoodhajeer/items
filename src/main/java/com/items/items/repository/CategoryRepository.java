package com.items.items.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.items.items.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
