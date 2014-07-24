package com.sample.fdp.inter;

import java.util.List;

import com.sample.fdp.model.Person;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
