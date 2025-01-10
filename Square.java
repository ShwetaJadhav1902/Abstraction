package com.abstraction;

public class Square extends Shape{
	private double radius;

	public Square(double radius) {
		super();
		this.radius = radius;
	}
	
	public double area() {
		return radius*radius*radius*radius;
	}

}
