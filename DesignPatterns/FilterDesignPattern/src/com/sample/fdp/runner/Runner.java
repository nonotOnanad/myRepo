package com.sample.fdp.runner;

import java.util.ArrayList;
import java.util.List;

import com.sample.fdp.inter.Criteria;
import com.sample.fdp.inter.impl.AndCriteria;
import com.sample.fdp.inter.impl.CriteriaFemale;
import com.sample.fdp.inter.impl.CriteriaMale;
import com.sample.fdp.inter.impl.CriteriaSingle;
import com.sample.fdp.inter.impl.OrCriteria;
import com.sample.fdp.model.Person;

public class Runner {

	public static void main(String[] args) {
		List<Person> persons =  new ArrayList<Person>();
		
		persons.add(new Person("Robert","Male","Single"));
		persons.add(new Person("John","Male","Married"));
		persons.add(new Person("Laura","Female","Married"));
		persons.add(new Person("Diana","Female","Single"));
		persons.add(new Person("Mike","Male","Single"));
		persons.add(new Person("Bobby","Male","Single"));
		
		Criteria male = new CriteriaMale();
		Criteria female =  new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single,male);
		Criteria singleOrFemale = new OrCriteria(single,female);
		
		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));
		
		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));
		
		System.out.println("\nSingle Males: ");
		printPersons(singleMale.meetCriteria(persons));
		
		System.out.println("\nSingle or Females:");
		printPersons(singleOrFemale.meetCriteria(persons));
	}

	public static void printPersons(List<Person> persons) {
		for (Person person : persons) { System.out.println("Person : [ Name : " + person.getName() 
				+", Gender : " + person.getGender() 
				+", Marital Status : " + person.getMaritalStatus() 
				+" ]"); }
	}

}
