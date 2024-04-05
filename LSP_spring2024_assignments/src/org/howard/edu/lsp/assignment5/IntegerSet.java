package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


/** 
 * Ujjawal Shah
 * @author Ujjawal
 * **/

/**
 * {@summary Responsible for the implementation of the set operation for the IntegerSet}
 * Class IntegerSet
 */
public class IntegerSet {

	
	// Store the set elements in an ArrayList
	private List<Integer> set = new ArrayList<Integer>();
	

	/**
	 * {@summary constructor of the class IngeterSet}
	 * @return void
	 */
	public IntegerSet() {
	}
	
	// Constructor if you want to pass in already initialized
	public IntegerSet(ArrayList<Integer> set) {
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.addAll(set);
        this.set = new ArrayList<>(hashSet);
	}
	
	/**
	 * {@summary Method to clear the elements in the set}
	 * @return void
	 */
	public void clear() {
		set.clear();
	};
	
	
	/**
	 * {@summary returns the size of the set}
	 * @return size of the set
	 */
	public int length() {
		return set.size(); // Returns the length of the set
	};
	
	/**
	 * {@summary method to check whether the Object b is equal to the set or not}
	 * @param b IntegerSet to be compared with
	 * @return true if the set b i equal to the set
	 */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerSet that = (IntegerSet) o;
        return set.equals(that.set);
    };

	
	/**
	 * {@summary method to check whether the value is present in the set or not}
	 * @param value integer value to be checked
	 * @return boolean true if the set contains the value, otherwise false
	 */
	public boolean contains(int value) {
		return set.contains(value); // Returns true if the set contains the value, otherwise false
	};    

	
	/**
	 * Class for the integer set exception handling
	 * @author Ujjawal
	 */
	public class IntegerSetException extends Exception{
		public IntegerSetException() {
			// print out the exception message
			super("The set is empty"); 	
		}
	}
	
	
	/**
	 * {@summary the method returns the largest value}
	 * @return highest Integer value in the set 
	 * @throws IntegerSetException if the set is empty
	 */
	public int largest() throws IntegerSetException  {
		// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
		int size = length();
		if (size==0) {
			throw(new IntegerSetException());
		}
//		set highest to the maximum value in the set
		int highest = Collections.max(set);
		return highest;
	}; 
	
	/**
	 * {@summary the method to return the smallest value in the set}
	 * @return smallest value in the set
	 * @throws IntegerSetException if the set is empty
	 */ 
	public int smallest() throws IntegerSetException  {
		// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
		int size = length();
		if (size==0) {
			throw(new IntegerSetException());
		}
		//set smallest to the minimum value in the set
		int smallest = Collections.min(set);
		return smallest;
	}; 

	
	/**
	 * {@summary the method to add the element to the set}
	 * @param item Integer item to be added to the set
	 */
	public void add(int item) {
		// Adds an item to the set or does nothing it already there	
		if (!contains(item)) {
			set.add(item);
		}
		
	}; 
	
	/**
	 * {@summary the method to remove the item from the set}
	 * @param item Integer item to be removed from the set
	 */	
    public void remove(int item) {
    	if (set.contains(item)) {
          set.remove((Integer) item);
    }
};

	/**
	 * {@summary the method to find out the union of the set}
	 * @param intSetb IntegerSet set to be unioned with
	 */
	public void union(IntegerSet intSetb) {
		// Set union
		intSetb.set.forEach(value -> add(value));
	};

	
	/**
	 * {@summary the method to find out the intersection of the set}
	 * @param intSetb IntegerSet to be intersected
	 */
	public void intersect(IntegerSet intSetb) {
		// Set intersection, all elements in s1 and s2
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int i = 0; i < intSetb.set.size(); i++) {
			if(contains(intSetb.set.get(i))) {
				newList.add(intSetb.set.get(i));
			}
		}
		
		set = newList;
	}; 
	
	
	/**
	 * {@summary the method to find out the difference of the set}
	 * @param intSetb IntegerSet to find out the difference.
	 */
	public void diff(IntegerSet intSetb) {
		// Set difference, i.e., s1 –s2
		intSetb.set.forEach(value -> remove(value));
	};
	
	
    /**
     * Modifies this set so that it contains only elements that are in this set but
     * not in the specified set.
     *
     * @param intSetb the set to subtract from this set
     */
    public void complement(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    };

	/**
	 * {@summary method checks whether the set is empty}
	 * @return true if the set is empty, else false
	 */
	boolean isEmpty() {
		// Returns true if the set is empty, false otherwise
		return length() == 0;
	}

	/**
	 * {@summary method to return the string representation of the set}
	 * @return string value of the set
	 */	
	public String toString() {
		// return String representation of your set
		return set.toString();
	};	
}