package org.sid.dao;
<<<<<<< HEAD

import org.sid.entities.TypeService;
=======
import org.sid.entities.type_services;
>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
<<<<<<< HEAD
public interface Type_ServiceRepository extends JpaRepository<TypeService, Integer> {
=======
public interface Type_ServiceRepository extends JpaRepository<type_services, Long>{

>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
}
