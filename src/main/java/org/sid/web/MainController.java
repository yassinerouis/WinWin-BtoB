package org.sid.web;

import java.util.List;


import org.sid.dao.ServicesRepo;
import org.sid.dao.Type_ServiceRepository;
import org.sid.dao.UserRepository;
import org.sid.entities.Services;
import org.sid.entities.TypeService;
import org.sid.entities.User;
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
	@Autowired
	Type_ServiceRepository servicetype;
	@PostMapping("/saveuser")
	public String saveUser(User user) {
		userrepository.save(user);
		return "addUser";
	}
	
	@GetMapping("/r")
	public String formulaireAjout(Model model) {
		model.addAttribute("user", new User());
		return "addUser";
	}
	@GetMapping("/")
	public String home() {
		
		return "index";
	}
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@GetMapping("/user/list")
	public String listDemande() {
		return "list_demande";
	}
	
	@GetMapping("/admin/addtype")
	public String servicetypeAjout(Model model) {
		model.addAttribute("service", new TypeService());
		return "addTypeService";
	}
	@PostMapping("admin/saveService")
	public String saveService(TypeService service) {
		servicetype.save(service);
		return "addTypeService";
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
	
	@GetMapping("/user/read_more")
	public String read(){
		return "read_more";
	}
	
}
