package org.howard.edu.lsp.assignment4;

/**
 * Represents a range of integers.
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    /**
     * Constructs a new IntegerRange with the given lower and upper bounds.
     * @param lowerBound the lower bound of the range
     * @param upperBound the upper bound of the range
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    @Override
    public boolean overlaps(Range other) {
        return !(upperBound < other.getLowerBound() || lowerBound > other.getUpperBound());
    }

    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    /**
     * Gets the lower bound of the range.
     * @return the lower bound of the range
     */
    public int getLowerBound() {
        return lowerBound;
    }

    /**
     * Gets the upper bound of the range.
     * @return the upper bound of the range
     */
    public int getUpperBound() {
        return upperBound;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IntegerRange other = (IntegerRange) obj;
        return lowerBound == other.lowerBound && upperBound == other.upperBound;
    }
}
