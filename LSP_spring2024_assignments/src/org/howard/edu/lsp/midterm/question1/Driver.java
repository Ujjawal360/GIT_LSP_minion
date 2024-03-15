package org.howard.edu.lsp.assignment4;

/**
 * A driver class for testing the SecurityOps class.
 */
public class Driver {
    
    /**
     * The main method that tests the encrypt method of the SecurityOps class.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Test the encrypt method from SecurityOps class
        String result = SecurityOps.encrypt("I love CSCI363");
        System.out.println(result);
    }
}
