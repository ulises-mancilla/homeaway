package com.homeaway.quiz.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.homeaway.quiz.service.GenericServiceList;

public  class GenericServiceListImpl<T> implements GenericServiceList {

	
	private List<T> elements;
	private int size;    
    
    public GenericServiceListImpl(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elements = new ArrayList<T>(initialCapacity);
        } else if (initialCapacity == 0) {
            this.elements = new ArrayList<T>();;
        } 
    }
    public GenericServiceListImpl() {
        this.elements = null;
    }
    
	
	
	public T get(int i) {
		return elements.get(i);
	}

	
	public void add(Object t) {
		 elements.add((T) t);
		
	}

	public int size() {
		return this.size;
	}

	
 
	
	
}
