package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		System.out.println("Value of Set1 is:" + set1.toString());
		
		try {
			System.out.println("Smallest value in Set1 is: " + set1.smallest());
			System.out.println("Largest value in Set1 is: " + set1.largest());
		} catch (IntegerSet.IntegerSetException e) {
			System.out.println("Unable to find the smallest or largest value: there are no elements in the set");
		}
		

		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("Value of Set1 is:" + set1.toString()); // Set1: [1,2,3]
		
		System.out.println("Value of Set2 is:" + set2.toString()); // Set2: [3,4,5]
		set1.union(set2);	// union of set1 and set2
		System.out.println("Result of union of Set1 and Set2" + set1.toString()); // result of union of set1 and set2 // Result: [1,2,3,4,5]

	}
}
