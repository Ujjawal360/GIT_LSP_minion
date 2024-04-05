package org.howard.edu.lsp.assignment5;

import org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {

    private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    public void setUp() {
        set1 = new IntegerSet();
        set2 = new IntegerSet();
    };
    

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set1.add(7);
        set1.add(15);
        set1.clear();
        
        // clear removes all the elements from the set, therefore the result is True
        assertTrue(set1.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        set1.add(1);
        set1.add(2);
        
        // adding 1 & 2 to set makes the size of it 2, the result is True
        assertEquals(2, set1.length());
    }


	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		set1.add(5);
		set1.add(7);
        
		// when we check if [5,7] is equal to [], the result is False
		assertFalse(set1.equals(set2));
		
		// when we check if [5,7] is equal to [5, 7], the result is True
		set2.add(5);
		set2.add(7);
		
		assertTrue(set1.equals(set2));
	}

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        set1.add(1);
        set1.add(2);
        assertTrue(set1.contains(1));   // it  contains 1 as a element in it
        assertFalse(set1.contains(3));  // it doesn't contain 3 as a element in it
    }


	@Test
	@DisplayName("Test case for largest")
	public void testLargest() throws IntegerSetException {
		set1.add(7);
		set1.add(5);
		set1.add(3);
		
		// among 7,5,3 in the set, 7 is the largest
		assertEquals(7, set1.largest()); // return True
		
		// for the exception handling
		assertThrows(IntegerSetException.class ,() -> {set2.largest();});
	};
	
	/**
	 * {@summary a method that checks the smallest method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() throws IntegerSetException {
		set1.add(0);
		set1.add(2);
		set1.add(3);
		// among 0,2,3 in the set, 0 is the smallest  
		assertEquals(0, set1.smallest());
		
		// for the exception handling 
		assertThrows(IntegerSetException.class ,
				() -> {
					set2.smallest();
				}
				);
	};

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        set1.add(1);
        set1.add(2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        set1.add(1);
        set1.add(2);
        set1.remove(1);
        // remove 1 and check if it contains 
        assertFalse(set1.contains(1));
        
        // check if it contains 2 
        assertTrue(set1.contains(2));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        
        // union of the set should give 1,2,3
        set1.union(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        
        // intersection of the set should give 2
        assertTrue(set1.contains(2));
        assertFalse(set1.contains(1));
        assertFalse(set1.contains(3));
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.diff(set2);
        
        // difference of the set should give 1
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
        assertFalse(set1.contains(3));
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.complement(set2);
        
        // complement of the set1 & set2 should give 1
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
        assertFalse(set1.contains(3));
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(set1.isEmpty());
        set1.add(1);
        assertFalse(set1.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        set1.add(1);
        set1.add(2);
        assertEquals("[1, 2]", set1.toString());
    }
}