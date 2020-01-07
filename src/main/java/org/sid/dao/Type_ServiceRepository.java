package org.sid.dao;
import org.sid.entities.type_services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface Type_ServiceRepository extends JpaRepository<type_services, Long>{

}
