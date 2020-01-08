package org.sid.dao;

import org.sid.entities.TypeService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface Type_ServiceRepository extends JpaRepository<TypeService, Long> {
}
