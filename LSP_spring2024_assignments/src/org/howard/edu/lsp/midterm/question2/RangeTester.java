package org.howard.edu.lsp.assignment4;

/**
 * A class for testing the IntegerRange class.
 */
public class RangeTester {
    public static void main(String[] args) {
        // Test IntegerRange class
        IntegerRange range1 = new IntegerRange(5, 10);
        IntegerRange range2 = new IntegerRange(8, 15);
        IntegerRange range3 = new IntegerRange(1, 3);

        // Test contains method
        System.out.println("Range 1 contains 7: " + range1.contains(7)); // true
        System.out.println("Range 2 contains 12: " + range2.contains(12)); // true
        System.out.println("Range 3 contains -1: " + range3.contains(-1)); // false

        // Test overlaps method
        System.out.println("Range 1 overlaps with Range 2: " + range1.overlaps(range2)); // true
        System.out.println("Range 1 overlaps with Range 3: " + range1.overlaps(range3)); // false

        // Test size method
        System.out.println("Size of Range 1: " + range1.size()); // 6
        System.out.println("Size of Range 2: " + range2.size()); // 8
        System.out.println("Size of Range 3: " + range3.size()); // 3

        // Test equals method
        IntegerRange range4 = new IntegerRange(5, 10);
        System.out.println("Range 1 equals Range 4: " + range1.equals(range4)); // true
    }
}
