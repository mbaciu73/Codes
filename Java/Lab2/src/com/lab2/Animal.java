package com.lab2;

public class Animal {
	private String name;
	private String breed;
	private int age;
	private boolean status;
	private String colour;

	public Animal(String name,String breed,int age,boolean status,String colour){
		this.name = name;
		this.breed=breed;
		this.age=age;
		this.status=status;
		this.colour=colour;
	}
	public Animal (String name) {
		this.name=name;
	}
	public String toString() {
		return "The animal is "+name+" and breed "+breed+", age is "+age+
				", domestic is "+status+" and the colour is "+colour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void makeNoise() {
		switch(breed) {
		case "dog":
			System.out.println("Woof");
			break;
		case "cat":
			System.out.println("Meow");
			break;
		case "pig":
			System.out.println("oink");
			break;
		case "mouse":
			System.out.println("squeak");
			break;
		default:
			System.out.println("Not known");
		}
	}
	public void makeNoise(boolean old) {
		if(old == true) {
			System.out.println( "Quiet Animal");
		}
		else {
			System.out.println( "Loud animal");
		}
	}
		
}
