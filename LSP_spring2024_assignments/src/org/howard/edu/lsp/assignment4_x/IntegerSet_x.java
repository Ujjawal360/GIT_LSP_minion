package org.howard.edu.lsp.assignment4_x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class IntegerSet_x {

	
	// Store the set elements in an ArrayList
	private List<Integer> set = new ArrayList<Integer>();
	

	// Default Constructor
	public IntegerSet_x() {
	}
	
	// Constructor if you want to pass in already initialized
	public IntegerSet_x(ArrayList<Integer> set) {
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.addAll(set);
        this.set = new ArrayList<>(hashSet);
	}
	
	//	Method to clear the set
	public void clear() {
		set.clear();
	};
	
	// Returns the length of the set
	public int length() {
		return set.size();
	};
	
	public boolean equals(Object b) {
		HashSet<?> newSet = new HashSet<>();
	    if (b instanceof HashSet) {
	        newSet = (HashSet<?>) Arrays.asList((Object[])b);
	    } else if (b instanceof Collection) {
	        newSet = new HashSet<>((Collection<?>)b);
	    }
	    
	    HashSet<Integer> existingSet = new HashSet<Integer>((Collection<Integer>)set);
	    
	    return newSet.equals(existingSet);
		
	}; 

	
	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		return set.contains(value);
	};    

	public class IntegerSetException extends Exception{
		public IntegerSetException() {
			// print out the exception message
			super("The set is empty"); 	
		}
	}
	
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException  {
		int size = length();
		if (size==0) {
			throw(new IntegerSetException());
		}
//		set highest to the maximum value in the set
		int highest = Collections.max(set);
		return highest;
	}; 
	

	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty 
	public int smallest() throws IntegerSetException  {
		int size = length();
		if (size==0) {
			throw(new IntegerSetException());
		}
		//set smallest to the minimum value in the set
		int smallest = Collections.min(set);
		return smallest;
	}; 

	// Adds an item to the set or does nothing it already there	
	public void add(int item) {
		if (!contains(item)) {
			set.add(item);
		}
		
	}; 
	
	// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		if(contains(item)) {
			set.remove(item);
		}
		
	}; 

	// Set union
	public void union(IntegerSet_x intSetb) {
		intSetb.set.forEach(value -> add(value));
	};

	// Set intersection, all elements in s1 and s2
	public void intersect(IntegerSet_x intSetb) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int i = 0; i < intSetb.set.size(); i++) {
			if(contains(intSetb.set.get(i))) {
				newList.add(intSetb.set.get(i));
			}
		}
		
		set = newList;
	}; 
	
	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet_x intSetb) {
		intSetb.set.forEach(value -> remove(value));
	};
	
	// Set complement, all elements not in s1
	public void complement(IntegerSet_x intSetb) {
	// s1 - set  
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int i = 0; i < length(); i++) {
			if(!contains(set.get(i))) {
				newList.add(set.get(i));
			}
		}
		
		set = newList;
	}

	// Returns true if the set is empty, false otherwise
	boolean isEmpty() {
		return length() == 0;
	}

	// Return String representation of your set.  This overrides the equal method from the Object class.
	public String toString() {
		return set.toString();
	};	// return String representation of your set


	
	

}
