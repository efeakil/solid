package com.efeakil.solid.o;

/**
 * @author Efe 
 * 		   The ShapeDecorator class in the example I provided is an abstract
 *         class because it is intended to be subclassed by specific decorator
 *         classes, such as ColoredRectangle.
 * 
 *         An abstract class can define an interface, or a set of methods that
 *         must be implemented by its subclasses, but it can also provide a
 *         default implementation for some or all of those methods. In this
 *         case, ShapeDecorator defines a constructor and an calculateArea
 *         method, and leaves the decision of how to implement it to its
 *         subclasses.
 * 
 *         An abstract class can't be instantiated and should be only used as a
 *         type. Subclassing it to create concrete decorator classes allows to
 *         add the new functionality while keeping the same interface and being
 *         able to use them interchangeably.
 * 
 *         Additionally, by making ShapeDecorator an abstract class, you can
 *         ensure that only decorator classes that are intended to be used with
 *         Shape objects can be created. This helps prevent mistakes and
 *         improves code maintainability.
 * 
 *         It's possible to do this with an interface as well, but when you use
 *         an interface you don't have the ability to share some of the
 *         implementation, which can lead to more code duplication and increased
 *         complexity.
 */

public abstract class ShapeDecorator implements IShape {

	protected IShape shape;

	public ShapeDecorator(IShape shape) {
		this.shape = shape;
	}

}
