package org.sid.web;

import org.sid.dao.DemandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class DemandeController {
@Autowired
DemandeRepository demande;
@PostMapping("/addDemande")
String demander() {
	
	return "/";
}
}
