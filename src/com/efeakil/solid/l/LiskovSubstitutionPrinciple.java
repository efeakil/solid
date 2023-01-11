package com.efeakil.solid.l;

/**
 * @author Efe 
 * 			In this example, the Rectangle class has a setWidth method and a
 *         setHeight method, as well as methods for getting the width, height,
 *         and area of the rectangle. The Square class extends the Rectangle
 *         class, and overrides the setWidth and setHeight methods to ensure
 *         that the width and height of a square are always equal.
 * 
 *         In the main method of the LiskovSubstitutionPrinciple class, a
 *         Rectangle object r is instantiated as a Square object. When the
 *         setWidth and setHeight methods are called on the r object, they are
 *         implemented by the overridden methods in the Square class. This
 *         demonstrates that the Square class is a substitute for the Rectangle
 *         class, and that the Square class can be used in place of the
 *         Rectangle class without affecting the correctness of the program.
 * 
 *         The Liskov Substitution Principle asserts that any implementation of
 *         a super-type should be replaceable with its sub-type, and the program
 *         should not change its behavior.
 */
public class LiskovSubstitutionPrinciple {

	public static void main(String[] args) {

		Rectangle r = new Square(5);
		r.setHeight(5);
		r.setWidth(10);

		System.out.println("Width: " + r.getWidth());
		System.out.println("Height: " + r.getHeight());
		System.out.println("Area: " + r.getArea());

	}

}
