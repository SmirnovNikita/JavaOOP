package com.gmail.archangelwolf98;

public class Cat {
	private String name;
	private String color;
	private double weight;
	private int age;

	public Cat(String name, String color, double weight, int age) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.age = age;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", weight=" + weight + ", age=" + age + "]";
	}

}
