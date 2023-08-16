package com.demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test {
		
	
	public static void main (String [] args) {
		Set<String> string=new HashSet<>();
		string.add("apple");
		string.add("s2");
        String[] elementsToAdd = {"apple", "banana", "cherry", "date"};

		Collections.addAll(string,elementsToAdd);
		System.out.println(string);
		}
	
}
