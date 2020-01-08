package org.sid.dao;
<<<<<<< HEAD

import org.sid.entities.Demande;
=======
import org.sid.entities.Demande;
import org.sid.entities.User;
>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
<<<<<<< HEAD
public interface DemandeRepository extends JpaRepository<Demande,Long>{

=======
public interface DemandeRepository extends JpaRepository <Demande, Long>{
>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
}
