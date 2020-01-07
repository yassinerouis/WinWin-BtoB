package org.sid.dao;
import org.sid.entities.Demande;
import org.sid.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface DemandeRepository extends JpaRepository <Demande, Long>{
}
