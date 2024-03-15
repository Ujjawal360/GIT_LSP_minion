package org.howard.edu.lsp.assignment4;

/**
 * Interface representing a range of integers.
 */
public interface Range {
    /**
     * Checks if the given value is within the range.
     * @param value the value to check
     * @return true if the value is within the range, false otherwise
     */
    boolean contains(int value);

    /**
     * Checks if the range overlaps with another range.
     * @param other the other range to check for overlap
     * @return true if there is an overlap, false otherwise
     */
    boolean overlaps(Range other);

    /**
     * Gets the lower bound of the range.
     * @return the lower bound of the range
     */
    int getLowerBound();

    /**
     * Gets the upper bound of the range.
     * @return the upper bound of the range
     */
    int getUpperBound();

    /**
     * Returns the number of integers in the range.
     * @return the number of integers in the range
     */
    int size();
}

