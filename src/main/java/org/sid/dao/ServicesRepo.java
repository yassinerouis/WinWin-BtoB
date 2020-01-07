package org.sid.dao;

import java.util.List;

import org.sid.entities.Services;
import org.sid.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ServicesRepo extends JpaRepository<Services, Long> {
	

}
