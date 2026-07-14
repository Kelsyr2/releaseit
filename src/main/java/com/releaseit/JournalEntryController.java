package com.releaseit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JournalEntryController 
{
	//@Autowired
	//private JournalRepository journalRepository;
	//Show new entry form
    @GetMapping("/new-entry")
    public String showNewEntryForm(Model model) 
    {

        
        model.addAttribute("entry", new JournalEntry());

        return "newentry";
    }
    	@GetMapping("/viewentries")
    	public String showViewEntries() 
    	{
    		return "viewentries";
    	}
    	
    	@PostMapping("/save-entry")
    	public String saveEntry(@ModelAttribute("entry") JournalEntry entry) {

    	    //journalRepository.save(entry);

    	    return "redirect:/viewentries";
    	}
    }
    
    	
    	
    
    
