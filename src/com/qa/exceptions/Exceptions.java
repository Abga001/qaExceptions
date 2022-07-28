package com.qa.exceptions;

import java.util.Scanner;

public class Exceptions {
	
	
	
    public static void main(String[] args) {
    	
    	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
    	System.out.print("Enter first number- ");  
    	int a= sc.nextInt();  
    	System.out.print("Enter second number- ");  
    	int b= sc.nextInt();   
    	int d=a/b;  
    	System.out.println("Total= " +d);  
        try {
        	//userName = myObj.nextLine();
            /** 
            The system will try to run whatever code is inside here 
            */
        } catch(Exception e) {
        	//System.out.println("Something went wrong.");
            /*** 
            If an exception occurs in the try block that matches ExceptionType of the catch statement then this block of code will run, name is the reference variable for the exception
            */
        } finally {
        	//System.out.println("Hello! " + userName + "!");
            /**
            Code within this block will always run regardless of whether or not an exception was thrown
            */
        }
    }
}