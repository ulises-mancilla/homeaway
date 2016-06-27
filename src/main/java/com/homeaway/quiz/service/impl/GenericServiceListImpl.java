package com.homeaway.quiz.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.homeaway.quiz.service.GenericServiceList;

public  class GenericServiceListImpl<T> implements GenericServiceList {

	
	private Object[] elements;
	private int size;
	private static final int DEFAULT= 10;
    private static final Object[] EMPTY = {};  

   
    
    
    public GenericServiceListImpl(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elements = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elements = EMPTY;
        } 
    }
    public GenericServiceListImpl() {
        this.elements = EMPTY;
    }
    
	
	
	public T get(int i) {
		return (T) elements[i];
	}

	
	public void add(Object t) {
		 elements[size++] = t;
		
	}

	public int size() {
		return this.size;
	}

	
 
	
	
}
