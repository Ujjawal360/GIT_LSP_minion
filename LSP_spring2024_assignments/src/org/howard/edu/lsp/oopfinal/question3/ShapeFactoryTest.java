package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// Test class for ShapeFactory
public class ShapeFactoryTest {

    // Test method to create a Circle shape using ShapeFactory
    @Test
    public void testCreateCircle() {
        Shape circle = ShapeFactory.createShape("circle");
        assertTrue(circle instanceof Circle); // Check if the created shape is an instance of Circle
    }

    // Test method to create a Rectangle shape using ShapeFactory
    @Test
    public void testCreateRectangle() {
        Shape rectangle = ShapeFactory.createShape("rectangle");
        assertTrue(rectangle instanceof Rectangle); // Check if the created shape is an instance of Rectangle
    }

    // Test method to create an invalid shape using ShapeFactory
    @Test
    public void testCreateInvalidShape() {
        Shape invalidShape = ShapeFactory.createShape("pentagon");
        assertNull(invalidShape); // Check if the created shape is null for an invalid shape type
    }
}

