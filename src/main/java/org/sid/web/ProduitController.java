package org.sid.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller


public class ProduitController {
	@Autowired
	ProduitRepository produitrepo;
	@RequestMapping(value="/produits")
	public String afficher(Model model) {
		List<Produit> produits = 
				produitrepo.findAll();
		model.addAttribute("employees", produits);
		return "index";
	}
	@GetMapping("/formProduit")
	public String formulaireAjout(Model model) {
		model.addAttribute("produit", new Produit());
		return "formProduit";
	}
	@PostMapping("/save")
	public String saveProduit(Produit produit) {
		produitrepo.save(produit);
		return "redirect:/produits";
	}
	@GetMapping("/delete")
	public String deleteProduit(
			@RequestParam(name="id") Long id) {
		produitrepo.deleteById(id);	
		return "redirect:/produits";
	}
	@GetMapping("/edit")
	public String editProduit(Model model,
			@RequestParam(name="id") Long id) {
		Produit p=produitrepo.findById(id).get();
		model.addAttribute("produit",p);
		return "edit";
	}
	@GetMapping("/")
	public String def() { 

		return "redirect:/index";
	}
/*	@RequestMapping("/getlogeduser")
	public Map<String,Object> getLoggedUser(HttpServletRequest http){
		HttpSession session=http.getSession();
		SecurityContext security=(SecurityContext)session.getAttribute("SPRING_SECURITY_CONTEXT");
		String username=security.getAuthentication().getName();
		List<String> roles=new ArrayList<>();
		for(GrantedAuthority gr:security.getAuthentication().getAuthorities()) {
			roles.add(gr.getAuthority());
		}
		Map<String,Object> params=new HashMap<>();
		params.put("username",username);
		params.put("roles",roles);

		return params;
	}*/
	
}
