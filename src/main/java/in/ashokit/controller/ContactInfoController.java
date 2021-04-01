package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.Contact;

@Controller
public class ContactInfoController {
@GetMapping("/load-form")
public String loadForm(Model model)
{
	Contact cobj=new Contact();
	model.addAttribute("contact", cobj);
	return "contact";
	}
@PostMapping("/saveContact")
public String handleSubmitBtn(Contact contact, Model model)
{
	boolean isSaved=service.saveOrUpdateContact(contact);
	if(isSaved)
	{
		model.addAttribute("succMsg", "Contact Saved");
		
	}else
	{
		model.addAttribute("failMsg" , "Failed to save Contact");
	}
	return "Contact";
	
}

public String handleViewContactHyperLink()
{
	return "allcontacts";
	
}
}
