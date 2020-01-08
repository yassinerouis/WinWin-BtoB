package org.sid.web;

import java.util.List;
<<<<<<< HEAD

import org.sid.dao.DemandeRepository;
=======
import java.util.Map;

>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
import org.sid.dao.ServicesRepo;
import org.sid.dao.Type_ServiceRepository;
import org.sid.dao.UserRepository;
import org.sid.entities.Services;
<<<<<<< HEAD
import org.sid.entities.TypeService;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
=======
import org.sid.entities.User;
import org.sid.entities.type_services;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
=======
>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	
	@Autowired
    UserRepository userrepository;
	@Autowired
	ServicesRepo srv;
<<<<<<< HEAD
	@Autowired
	Type_ServiceRepository servicetype;
	@Autowired
    public JavaMailSender emailSender;
	@Autowired
	DemandeRepository demande;
=======
>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
	
	@PostMapping("/saveuser")
	public String saveUser(User user) {
		userrepository.save(user);
		return "addUser";
	}
	
<<<<<<< HEAD
	@GetMapping("/r")
=======
	@GetMapping("/")
>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
	public String formulaireAjout(Model model) {
		model.addAttribute("user", new User());
		return "addUser";
	}
<<<<<<< HEAD
	@GetMapping("/")
	public String home() {
		
		return "index";
	}
	@RequestMapping("/login")
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
=======
	
	@RequestMapping("/services")
	public ModelAndView ajoutService(Services service){
		ModelAndView mv = new ModelAndView("addService");
>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
		srv.save(service);
		return mv;
	}
	
	@RequestMapping("/admin/services")
	public List<Services> Service(Services service){
		ModelAndView mv = new ModelAndView("Services");
		List<Services> l = (List<Services>) srv.findAll();
<<<<<<< HEAD
		return l;
	}
	
	@GetMapping("/user/read_more")
	public String read(){
		return "read_more";
	}
	
=======
		
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

>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
}
