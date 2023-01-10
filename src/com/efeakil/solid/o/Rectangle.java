package com.efeakil.solid.o;

public class Rectangle implements IShape {

	private final double height;
	private final double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double calculateArea() {
		return height*width;
	}

}
