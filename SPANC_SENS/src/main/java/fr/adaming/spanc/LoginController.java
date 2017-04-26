package fr.adaming.spanc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping(value="/Login")
	public String seConnecter() {
		return "Login";
	}

}
