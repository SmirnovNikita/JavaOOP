package com.gmail.archangelwolf98;

public class Main {

	public static void main(String[] args) {
		Triangle triangleOne = new Triangle(2, 3, 4);
		Triangle triangleTwo = new Triangle(5, 6, 7);

		System.out.println(triangleOne.area());
		System.out.println(triangleTwo.area());
	}

}
