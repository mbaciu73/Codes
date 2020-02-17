 package com.lab2;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		Animal a0 = new Animal("Lucas","Dog",4,true,"Black");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = input.nextLine();
		System.out.println("Enter the breed");
		String breed = input.nextLine();
		System.out.println("Enter age");
		//this must be used otherwise it will skip over age and go to domestic
		int age = Integer.parseInt(input.nextLine());
		System.out.println("Is it domestic?");
		//this is the same as the comment before 
		boolean status = Boolean.parseBoolean(input.nextLine());
		System.out.println("Enter colour");
		String colour = input.nextLine();
	
		Animal a1 = new Animal(name,breed,age,status,colour);
		a1.setName(name);
		a1.setAge(age);
		a1.setBreed(breed);
		a1.setColour(colour);
		a1.setStatus(status);
		
		System.out.println(a1.getName());
		System.out.println(a1.getBreed());
		System.out.println(a1.getAge());
		System.out.println(a1.getStatus());
		System.out.println(a1.getColour());
		
		a1.makeNoise();
		a1.makeNoise(false);
		
		
		
		
	}

}
