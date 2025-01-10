package com.abstraction;

public class Circle extends Shape {
	private final double PI=3.14;
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius=radius;
	}
	
	public double area() {
		return PI*(radius*radius);
	}

}
