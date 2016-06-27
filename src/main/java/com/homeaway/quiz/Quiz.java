package com.homeaway.quiz;

import com.homeaway.quiz.domain.Person;
import com.homeaway.quiz.service.GenericServiceList;
import com.homeaway.quiz.service.impl.GenericServiceListImpl;

public class Quiz {

	public static void main(String[] args) {
		
		GenericServiceList<Person> persons= new GenericServiceListImpl<>(10);
		
		Person rockStar= new Person();
		rockStar.setName("ulises");
		rockStar.setAge(30);
		
		persons.add(rockStar);
		int size=persons.size();
		Person lastPerson=persons.get(0);
		
		
		
		
		
		
	}

}
