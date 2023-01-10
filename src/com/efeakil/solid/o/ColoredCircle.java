package com.efeakil.solid.o;

public class ColoredCircle extends ShapeDecorator {
	
	private String color;

	public ColoredCircle(IShape shape, String color) {
		super(shape);
		this.color = color;
	}

	public double calculateArea() {
		return shape.calculateArea();
	}
	
	public String getColor() {
		return color;
	}
	
	
}
