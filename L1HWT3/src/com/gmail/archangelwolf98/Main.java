package com.gmail.archangelwolf98;

public class Main {

	public static void main(String[] args) {
		Vector3d vectorOne = new Vector3d(1.2,2.3,3.4);
		Vector3d vectorTwo = new Vector3d(4.5,5.6,6.7);
		
		Vector3d sumV = vectorOne.sum(vectorTwo);
		Vector3d vectorV = vectorOne.vector(vectorTwo);
		
		System.out.println(vectorOne);
		System.out.println(vectorTwo);
		System.out.println();
		System.out.println(sumV);
		System.out.println(vectorOne.scalar(vectorTwo));
		System.out.println(vectorV);
		

	}

}
