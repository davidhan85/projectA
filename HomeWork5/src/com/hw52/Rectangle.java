package com.hw52;

public class Rectangle {
	int wight=15;
	int height=25;
	int circumference;
	int Area;
	public	void computeArea() {
		Area=wight*height;
		System.out.println("長方形面積:"+Area);
	}
	
	public	void computeCircumference() {
		circumference=(wight+height)*2;
		System.out.println("長方形周長:"+circumference);
	}
	
}
