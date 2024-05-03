package org.howard.edu.lsp.oopfinal.question3;

//Circle class implements the Shape interface
public class Circle implements Shape {
	
	// Override the draw method defined in the Shape interface
    @Override
    public void draw() {
        System.out.println("I’m a Circle!!!");
    }
}