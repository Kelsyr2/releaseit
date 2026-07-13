package com.releaseit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLogin(Model model) {

        model.addAttribute("login", new Login());

        return "login";
    }


    @PostMapping("/login")
    public String processLogin(@ModelAttribute Login login) {

        System.out.println("User email: " + login.getEmail());

        return "redirect:/";
    }
}