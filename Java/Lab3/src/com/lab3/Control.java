/* This class displays the classes which were created as well as adding polymorphism to display the results in a more 
 * orderly fashion
 * Author:Markus Baciu
 */
package com.lab3;

public class Control {
	
	public static void main(String[] args) {
		Employee p1 = new Employee("Sultan","Alghamdi",696969,100);
		//print p1
		System.out.println(p1);
		System.out.println(p1.calculatePay());
		
		hourlyEmployee h1 = new hourlyEmployee("Markus","Baciu",34783,192020,8,9);
		//print h1
		System.out.println(h1);
		System.out.println(h1.calculatePay());
		
		salesEmployee s1 = new salesEmployee("Enoch","Duadu",67453,45000,3);
		//print s1
		System.out.println(s1);
		System.out.println(s1.calculatePay());
		//creating array
		Employee [] people = new Employee[3];
		//setting array index to object
		people[0]=p1;
		people[1]=h1;
		people[2]=s1;
		//for loop for a quick way of displaying array
		for(int i=0;i<people.length;i++) {
			 double display = people[i].calculatePay();
			 System.out.print("\nThe calculated pay is ");
			 System.out.print(display);
			
		}
		
		
		
		
		//how to create an array Classname [] nameofarray = new Classname[size of array];
		//nameofarray[0]=objectname
	}

}
