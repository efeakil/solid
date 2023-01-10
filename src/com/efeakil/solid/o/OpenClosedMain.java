package com.efeakil.solid.o;

/**
 * @author Efe 
 * 			The Open-Closed Principle (OCP) is one of the five principles of
 *         object-oriented programming known as SOLID. It states that a class
 *         should be open for extension but closed for modification. This means
 *         that the behavior of a class should be able to be extended without
 *         modifying the source code of the class itself.
 * 
 *         Here's an example of how the OCP can be applied in Java:
 * 
 *         Let's say you have a class called Rectangle that has a method called
 *         calculateArea() that calculates the area of a rectangle. Later on,
 *         you decide that you also want to be able to calculate the area of a
 *         circle.
 * 
 *         One way to do this would be to modify the Rectangle class to include
 *         a method for calculating the area of a circle, but this would violate
 *         the OCP, because you would be modifying the source code of the
 *         Rectangle class.
 * 
 *         A better way to do this would be to create a new interface called
 *         Shape that defines a method called calculateArea(). The Rectangle
 *         class would then implement this interface, and you could create a new
 *         class called Circle that also implements this interface.
 * 
 *         Now you can easily add new shapes by creating new classes that
 *         implement the Shape interface, without modifying the existing
 *         Rectangle and Circle classes. This allows you to extend the behavior
 *         of your program without modifying existing code, which is the main
 *         idea behind the OCP.
 */

public class OpenClosedMain {

	public static void main(String[] args) {

		// Using interface called IShape
		IShape rectangle = new Rectangle(10, 20);
		IShape circle = new Circle(5);
		System.out.println(rectangle.calculateArea());
		System.out.println(circle.calculateArea());

		// Another way of doing it is by using decorator pattern, which allows to add
		// new behaviors to the objects without modifying their class.

		// Decorator Design Pattern
		IShape coloredRectangle = new ColoredRectangle(new Rectangle(3, 4), "blue");
		System.out.println(coloredRectangle.calculateArea());
		
		IShape coloredCircle = new ColoredCircle(new Circle(3),"red");
		System.out.println(coloredCircle.calculateArea());
	}

}
