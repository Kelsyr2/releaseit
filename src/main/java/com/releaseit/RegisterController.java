package com.releaseit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class RegisterController {
	
	private static final Logger logger =
	        LoggerFactory.getLogger(RegisterController.class);
	
	//@Autowired
	//private RegisterRepository registerRepository;

    // Show registration form
	@GetMapping("/register")
	public String showRegisterForm(Model model) {

	    logger.info("Entering RegisterController.showRegisterForm()");

	    model.addAttribute("register", new Register());

	    logger.info("Exiting RegisterController.showRegisterForm()");

	    return "register";
	}

	@PostMapping("/register")
	public String processRegister(@ModelAttribute Register register) {

	    logger.info("Entering RegisterController.processRegister()");

	    try {

	        logger.info("Exiting RegisterController.processRegister()");

	        return "redirect:/login";

	    } catch(Exception e) {

	        logger.error("Error processing registration", e);

	        throw e;
	    }
	}
}