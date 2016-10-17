package com.cisc181.core;

import java.util.Date;
import java.util.regex.Pattern;


public class PersonException extends Exception {

	private Person person;


	public PersonException(Person person)  {
		this.person = person;
//		if ( person.getDOB().getYear() -  new Date().getYear()> 100) {
//		}
//		Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\-\\d{3}\\-\\d{4}");
//		if (person.getPhone().length()!=14 || !pattern.matcher(person.getPhone()).matches()) {
//		}
	}
	
}
