package com.gmail.archangelwolf98;

public class Main {

	public static void main(String[] args) {
		Phone phone1 = new Phone("Iphone 8",111);
		phone1.registrationInNetwork();
		Phone phone2 = new Phone("Iphone SE",222);
		phone2.registrationInNetwork();
		Phone phone3 = new Phone("MEIZU m3s",333);
		phone1.call(222);
		phone2.call(333);

	}
}
