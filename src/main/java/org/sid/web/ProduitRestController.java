package org.sid.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduitRestController {
	@RequestMapping("/getlogeduser")
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
	}
}
