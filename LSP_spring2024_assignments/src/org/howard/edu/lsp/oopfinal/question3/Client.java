package org.howard.edu.lsp.oopfinal.question3;

//Client.java
//Client class contains the main method to test the ShapeFactory and Shape implementations
public class Client {
	// Main method to create shapes using ShapeFactory and test their draw methods
 public static void main(String[] args) {
     Shape c = ShapeFactory.createShape("circle");
     c.draw();
  // Create a Rectangle shape using ShapeFactory
     Shape r = ShapeFactory.createShape("rectangle");
     r.draw();
 }
}
