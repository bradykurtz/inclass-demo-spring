package edu.weber.inclassdemospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import edu.weber.inclassdemospring.contact.ContactRepository;
import edu.weber.inclassdemospring.contact.ContactService;

@Configuration
public class WebConfig {

	@Bean
	@Scope("")
	public ContactService contactService(ContactRepository contactRepository) {
		ContactService service = new ContactService(contactRepository);
		service.setSetMe("I Set This");
		return service;
	}

	@Bean
	public ContactRepository contactRepository() {
		return new ContactRepository();
	}
	
}
