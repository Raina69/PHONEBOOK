package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.Contact;
import in.ashokit.service.ContactService;

@Controller
public class ContactOperationsController {
	private ContactService service;
	
	public ContactOperationsController(ContactService service) {
		super();
		this.service = service;
	}

	@GetMapping("/edit")
public String editContact(@RequestParam("cid")Integer contactId, Model model)
{
		Contact contactObj=service.getContactById(contactId);
		
		model.addAttribute("contact","contactObj");
	return "contact";
	
}
	@GetMapping("/delete")
public String deleteContact(@RequestParam("cid")Integer contactId, Model model)
	{
		boolean isDeleted=service.deleteContactById(contactId);
		if(isDeleted)
		{
			model.addAttribute("succMsg", "Contact deleted successfully");
			
		}else
		{
			model.addAttribute("faileMsg", "Failed to Delete Contact");
		}
		return  "redirect:view-contacts";
		
	}
}
