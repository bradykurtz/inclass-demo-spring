package edu.weber.inclassdemospring.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contact")
public class ContactController {
	
	private ContactService contacteService;
	
	@Autowired
	public ContactController(ContactService contactService) {
		this.contacteService = contactService;
	}
	
	@RequestMapping(value="me/{id}",method=RequestMethod.GET)
	public Contact getContact(@PathVariable() String id, @RequestParam("me") String me) {
		Contact c = new Contact();
		c.setMe(me);
		c.setId(id);
		return c;
	}
}
