package com.efeakil.solid.o;

public class Circle implements IShape {
	
	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI*radius*radius;
	}
}
