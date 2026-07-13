package com.releaseit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class RegisterController {
	
	@Autowired
	private RegisterRepository registerRepository;

    // Show registration form
    @GetMapping("/register")
    public String showRegisterForm(Model model) {

        model.addAttribute("register", new Register());

        return "register";
    }

    @PostMapping("/register")
    public String processRegister(@ModelAttribute Register register) {

        registerRepository.save(register);

        return "redirect:/login";
    }
}