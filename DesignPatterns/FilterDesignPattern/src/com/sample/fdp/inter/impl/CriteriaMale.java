package com.sample.fdp.inter.impl;

import java.util.ArrayList;
import java.util.List;

import com.sample.fdp.inter.Criteria;
import com.sample.fdp.model.Person;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for(Person person : persons){
			if(person.getGender().equalsIgnoreCase("MALE")){
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
