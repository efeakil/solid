package com.efeakil.solid.o;

public class ColoredRectangle extends ShapeDecorator {
	
	private String color;

	public ColoredRectangle(IShape shape, String color) {
		super(shape);
		this.color = color;
	}

	@Override
	public double calculateArea() {
		return shape.calculateArea();
	}
	
	public String getColor() {
		return color;
	}
	
	
}
