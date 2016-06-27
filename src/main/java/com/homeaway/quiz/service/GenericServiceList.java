package com.homeaway.quiz.service;



public interface GenericServiceList<T> {
	
	T get(int i);
	void add(T t);
	int size();
	
}
