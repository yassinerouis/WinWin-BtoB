package org.sid.web.UserController;

import org.sid.dao.UserRepository;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	@Autowired
UserRepository userrepository;

	@PostMapping("/saveuser")
	public String saveUser(User user) {

		userrepository.save(user);
		return "addUser";
	}
	
	@GetMapping("/")
	public String formulaireAjout(Model model) {
		model.addAttribute("user", new User());
		return "addUser";
	}



}
