package edu.weber.inclassdemospring.contact;

import org.springframework.stereotype.Service;

public class ContactService {
	
	private ContactRepository contactRepo;
	private String setMe;
	
	public ContactService(ContactRepository contactRepo) {
		this.contactRepo = contactRepo;
	}

	public Contact getContactById(String id) {
		//do stuff
		return new Contact();
	}

	public String getSetMe() {
		return setMe;
	}

	public void setSetMe(String setMe) {
		this.setMe = setMe;
	}
	
	
	
}
