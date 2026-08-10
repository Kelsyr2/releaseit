package com.releaseit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class LoginController {
	
	private static final Logger logger =
	        LoggerFactory.getLogger(LoginController.class);

	@GetMapping("/login")
	public String showLogin(Model model) {

	    logger.info("Entering LoginController.showLogin()");

	    model.addAttribute("login", new Login());

	    logger.info("Exiting LoginController.showLogin()");

	    return "login";
	}


	@PostMapping("/login")
	public String processLogin(@ModelAttribute Login login) {

	    logger.info("Entering LoginController.processLogin()");

	    try {

	        logger.info("Login request processed successfully");

	        logger.info("Exiting LoginController.processLogin()");

	        return "redirect:/";

	    } catch(Exception e) {

	        logger.error("Error processing login request", e);

	        throw e;
	    }
	}
}