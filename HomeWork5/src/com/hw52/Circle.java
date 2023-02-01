package com.hw52;

public class Circle implements Shape {
	final	double  pi=3.14;
	double r=7;
	double circumference;
	double Area;
	double x=2;
	public	void computeArea() {
		Area=pi*(r*r);
		System.out.println("圓形面積:"+Area);
	}
	
	public	void computeCircumference() {
		circumference=(x*pi*r);
		System.out.println("圓形周長:"+circumference);
		
	}
}
