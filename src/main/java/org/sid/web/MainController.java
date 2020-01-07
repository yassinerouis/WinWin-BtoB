package org.sid.web;

import java.util.List;
import java.util.Map;

import org.sid.dao.ServicesRepo;
import org.sid.dao.Type_ServiceRepository;
import org.sid.dao.UserRepository;
import org.sid.entities.Services;
import org.sid.entities.User;
import org.sid.entities.type_services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	
	@Autowired
    UserRepository userrepository;
	@Autowired
	ServicesRepo srv;
	
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
	
	@RequestMapping("/services")
	public ModelAndView ajoutService(Services service){
		ModelAndView mv = new ModelAndView("Services");
		srv.save(service);
		return mv;
	}
	
	@RequestMapping("/admin/services")
	public List<Services> Service(Services service){
		ModelAndView mv = new ModelAndView("Services");
		List<Services> l = (List<Services>) srv.findAll();
		
		return l;
	}
	@Autowired
	Type_ServiceRepository serviceRepository;

	@GetMapping("/service")
	public String formulaireAjoutService(Model model) {
		model.addAttribute("service", new type_services());
		return "addTypeService";
	}

	@PostMapping("/saveService")
	public String saveService(type_services service) {
		serviceRepository.save(service);
		return "addTypeService";
	}

}
