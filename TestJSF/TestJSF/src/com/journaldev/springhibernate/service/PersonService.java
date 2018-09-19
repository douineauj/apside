package com.journaldev.springhibernate.service;

import java.util.ArrayList;
import java.util.List;

import com.journaldev.springhibernate.model.Person;

public class PersonService {

	private final static String[] names;
	private final static String[] countries;
	private static List<Person> persons = new ArrayList<Person>();
	private static int uniqueId;


    static {
    	names = new String[3];
    	names[0]= "Joss";
    	names[1]= "John";
    	names[2]= "Mario";
    	
    	countries = new String[3];
    	countries[0]= "FR";
    	countries[1]= "GB";
    	countries[2]= "IT";
    }
    
    
    public void createPersons(int size) {
    	for(int i = 0 ; i < size ; i++) {
    		persons.add(new Person(i, names[i], countries[i]));
    	}
    	uniqueId = size;
    }
    
    public void addPerson(Person p) {
    	p.setId(++uniqueId);
    	persons.add(p);
    }

	public static int getUniqueId() {
		return uniqueId;
	}

	public List<Person> getPersons() {
		return persons;
	}
    
}
