// Brian Hodge
// C00170400
// CMPS 260
// Programming Assignment: #1
// Due Date: 1/31/2019 at 11:55 pm
// Program Description: This program reads (from user input) the length
//  and width of a rectangle, plus the units of measurement. The program
//  then computes and displays the area of the rectangle to 3 decimal places.
// Certificate of Authenticity: I certify that the code in the method
//  function main of this project is entirely my own work.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    //Prompt the user to enter the length of a rectangle
        System.out.print("Enter length: ");
        double length = input.nextDouble();

        //Prompt the user to enter the width of a rectangle
        System.out.print("Enter width: ");
        double width = input.nextDouble();

        //Prompt the user to enter the units of measurement
        System.out.print("Enter units: ");
        String units = input.next();

        //Compute area of the rectangle
        double area = length * width;

        //Display results
        System.out.printf("Area: %.3f", area);
        System.out.println(" square" + " " + units);

    }
}
