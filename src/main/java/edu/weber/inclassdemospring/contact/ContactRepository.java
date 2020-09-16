package edu.weber.inclassdemospring.contact;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public class ContactRepository {
	

	
	public ContactRepository() {
		
	}
	
	public Contact getContactById(String id) {
		return new Contact();
	}

}
