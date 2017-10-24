package com.gmail.archangelwolf98;

public class Phone {
	private String model;
	private long number;

	public Phone(String model, long number) {
		super();
		this.model = model;
		this.number = number;
	}

	public Phone() {
		super();
	}

	public void call(long number) {
		if (Network.searche(number)) {
			System.out.println("Calling " + number);
		} else {
			System.out.println("Number " + number + " invalide");
		}

	}

	public void registrationInNetwork() {
		Network.registrationNumber(number);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Phone [model=" + model + ", number=" + number + "]";
	}

}
