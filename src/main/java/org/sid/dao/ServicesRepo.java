package org.sid.dao;

import java.util.List;

import org.sid.entities.Services;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ServicesRepo extends CrudRepository<Services, Long> {
	
	List<Services> findByType();
	List<Services> findByRating();
}
