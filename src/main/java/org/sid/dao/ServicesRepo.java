package org.sid.dao;

import java.util.List;

import org.sid.entities.Services;
import org.springframework.data.repository.CrudRepository;

public interface ServicesRepo extends CrudRepository<Services, Integer> {
	
	List<Services> findByType();
	List<Services> findByRating();
}
