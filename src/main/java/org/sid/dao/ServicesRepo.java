package org.sid.dao;

import java.util.List;

import org.sid.entities.Services;
<<<<<<< HEAD
=======
import org.sid.entities.User;
>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ServicesRepo extends JpaRepository<Services, Long> {
	

}
