package com.cisc181.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class PersonException extends Exception{
	
	private Person person;

	
	public PersonException(Person person){
		this.person = person;
		//this.person.formatPhone(person.getPhone());
	}
	
	public Person getPerson(){
		return person;
	}
	

	 

	
}
