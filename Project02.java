package edu.uwm.Project02;

//Jessica Gilmore
//gilmorej
//CS 201 811
//Programming Assignment 02 

//This program is meant to establish three variables to hold measurements, 
//one variable to define the measurements and one variable to define 
//the area of a room without the ceiling.
//It will then calculate the equation to find the area and output the value.

public class Project02 {
	public static void main(String[] args) {
		// Declare length variable
		double length;

		// Declare width variable
		double width;

		// Declare height variable
		double height;

		// Declare the units of measurement variable
		String unit;

		// Declare area variable
		double area;

		// assign values to the variables above
		length = 7.0;
		width = 9.5;
		height = 8.25;
		unit = "Feet";
		area = (2 * (height * width)) + (2 * (height * length));

		// print out the declared variables and the area of the room
		System.out.println("Given a length of " + length + " " + unit);
		System.out.println("a width of " + width + " " + unit);
		System.out.println("and a height of " + height + " " + unit);
		System.out.println(" ");
		System.out.println("The wall's of the room defined have a");
		System.out.print("surface area of : " + area + " " + unit + " squared.");
	
	}
}
