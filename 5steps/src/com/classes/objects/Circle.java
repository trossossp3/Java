package com.classes.objects;

public class Circle {

	private double radius;
	
	public Circle() {
		//the radius gets a default value of 0.0
	}
	public Circle(double rad) {
		radius = rad;
}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double rad) {
		radius = rad;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

