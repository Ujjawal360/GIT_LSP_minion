package org.howard.edu.lsp.assignment4_x;

import java.util.ArrayList;
import java.util.List;

/** 
 * Ujjawal Shah
 * @author Ujjawal
 * **/

/**
 * {@summary Responsible for the implementation of the set operation for the IntegerSet}
 * Class IntegerSet
 */
public class Driver_x {
	public static void main(String[] args) {
		IntegerSet_x set = new IntegerSet_x();
		
		set.add(0);
		set.add(0);
		set.add(45);
		set.add(45);
		System.out.println(set);
		System.out.println(set.length());
//		set.clear();
		System.out.println(set);
		System.out.println(set.length());
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(0);
		IntegerSet_x newSet = new IntegerSet_x(list);
		System.out.println(newSet);
		
		System.out.println("this"+newSet.toString());
		
		try {
			System.out.println("Smallest value in Set1 is: " + set.smallest());
			System.out.println("Largest value in Set1 is: " + set.largest());
		} catch (IntegerSet_x.IntegerSetException e) {
			System.out.println("Unable to find the smallest or largest value: there are no elements in the set");
		}
		set.remove(0);
		System.out.println("Set1"+set);
		System.out.println("Set2"+newSet);
		set.union(newSet);
		System.out.println("Union"+set);
		
		System.out.println("Set1"+set);
		System.out.println("Set2"+newSet);

		set.intersect(newSet);
		System.out.println("Set1"+set);
//		<----------------------------->
		System.out.println("Professor Output -----------------------------");
		IntegerSet_x set1 = new IntegerSet_x();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		System.out.println("Value of Set1 is:" + set1.toString());
		
		try {
			System.out.println("Smallest value in Set1 is: " + set1.smallest());
			System.out.println("Largest value in Set1 is: " + set1.largest());
		} catch (IntegerSet_x.IntegerSetException e) {
			System.out.println("Unable to find the smallest or largest value: there are no elements in the set");
		}
		

		IntegerSet_x set2 = new IntegerSet_x();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("Value of Set1 is:" + set1.toString()); // Set1: [1,2,3]
		
		System.out.println("Value of Set2 is:" + set2.toString()); // Set2: [3,4,5]
		set1.union(set2);	// union of set1 and set2
		System.out.println("Result of union of Set1 and Set2" + set1.toString()); // result of union of set1 and set2 // Result: [1,2,3,4,5]
		


	}
}
