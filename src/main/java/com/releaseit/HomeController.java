package com.releaseit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
public class HomeController 
{
	private static final Logger logger = 
			LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String home(Model model)
	{
	    logger.info("Entering HomeController.home()");

	    model.addAttribute("message", "Welcome to Release It!");

	    logger.info("Exiting HomeController.home()");

	    return "index";
	}
	
	@GetMapping("/about")
	public String about() 
	{
		return "about";
		
	}

}
