package com.efeakil.solid.l;

public class Square extends Rectangle {

	public Square(double width) {
		super(width, width);
	}

	public void setWidth(double width) {
		super.setWidth(width);
		super.setHeight(width);
	}
	
	public void setHeight(double height) {
		super.setHeight(height);
		super.setWidth(height);
	}
	
	
	
}
