package com.releaseit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class JournalEntryController 
{
	private static final Logger logger =
	        LoggerFactory.getLogger(JournalEntryController.class);
	
	@Autowired
	private JournalRepository journalRepository;
	//Show new entry form
	@GetMapping("/new-entry")
	public String showNewEntryForm(Model model)
	{

	    logger.info("Entering JournalEntryController.showNewEntryForm()");

	    model.addAttribute("entry", new JournalEntry());

	    logger.info("Exiting JournalEntryController.showNewEntryForm()");

	    return "newentry";
	}
	@GetMapping("/viewentries")
	public String showViewEntries(Model model) {

	    logger.info("Entering JournalEntryController.showViewEntries()");

	    model.addAttribute("entries", journalRepository.findAll());

	    logger.info("Exiting JournalEntryController.showViewEntries()");

	    return "viewentries";
	}
    	
	@PostMapping("/save-entry")
	public String saveEntry(@ModelAttribute("entry") JournalEntry entry) {

	    logger.info("Entering JournalEntryController.saveEntry()");

	    try {
	        journalRepository.save(entry);

	        logger.info("Journal entry saved successfully");

	        logger.info("Exiting JournalEntryController.saveEntry()");
	        
	        journalRepository.save(entry);
	        return "redirect:/viewentries";

	    } catch(Exception e) {

	        logger.error("Error saving journal entry", e);

	        throw e;
	    }
	}
}
    
    	
    	
    
    
