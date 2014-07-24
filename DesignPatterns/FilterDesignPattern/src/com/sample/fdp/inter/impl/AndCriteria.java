package com.sample.fdp.inter.impl;

import java.util.List;

import com.sample.fdp.inter.Criteria;
import com.sample.fdp.model.Person;

public class AndCriteria implements Criteria {
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria){
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
