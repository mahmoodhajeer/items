package com.items.items.controller;



import java.util.Optional;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.items.items.message.request.ItemForm;
import com.items.items.model.Category;
import com.items.items.model.Item;
import com.items.items.model.Location;
import com.items.items.model.User;
import com.items.items.repository.ItemRepository;
import com.items.items.repository.UserRepository;

@Transactional
@RestController
@RequestMapping("/item/")
public class ItemController {
	
	
	@Autowired
	 UserRepository userRepository;
	@Autowired
	 ItemRepository itemRepository;
	
	
		
	@PersistenceContext
	  private EntityManager em;
	
	@PostMapping("/newitem")
	public ResponseEntity<?> insertItem(@Valid @RequestBody ItemForm newItem ){
		
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    String username = auth.getName();
		    
		    User user = userRepository.findByUserName(username)
	                    .orElseThrow(() -> 
	                     new UsernameNotFoundException("User Not Found with -> username or email : " + username)
	                    );
		

		Item item = new Item(newItem.getItemName(),newItem.getItemDescription());
		Location location = newItem.getLocationId();
		Set<Category> category = newItem.getCategoryId();
		 
		item.setCategoryId(category);
		item.setLocationId(location); 		
	    item.setUserId(user);
	    
	    em.persist(item);
	    em.persist(location);
		
		
		return ResponseEntity.ok().body("item insertion successfully! "+item);
	}
	
	
	
	
	@GetMapping("/item/{id}")
	public Optional<Item> getItemById(@PathVariable(value = "id") Long itemId) {
		 
		return  itemRepository.findById(itemId);
	 
	}

}
