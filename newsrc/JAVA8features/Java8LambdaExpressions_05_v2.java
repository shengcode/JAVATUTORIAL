package com.atosSyntel.Java8Samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Java8LambdaExpressions_05_v2 { 
	private int operate(int a, int b, myFunctionInterface1 fobj){ 
		return fobj.operation(a, b); 
	}
	public static void main(String args[]){ 
		// lambda expression for addition for two parameters 
		// data type for x and y is optional. 
		// This expression implements 'myFunctionInterface1' interface 
		myFunctionInterface1 add = (int x, int y) -> x + y; 

		// lambda expression multiplication for two parameters 
		// This expression also implements 'FuncInter1' interface 
		myFunctionInterface1 multiply = (int x, int y) -> x * y; 

		// Creating an object of Test to call operate using 
		// different implementations using lambda Expressions 
		Java8LambdaExpressions_05_v2 tobj = new Java8LambdaExpressions_05_v2(); 

		// Add two numbers using lambda expression 
		System.out.println("Addition is " +tobj.operate(6, 3, add)); 

		// Multiply two numbers using lambda expression 
		System.out.println("Multiplication is " + tobj.operate(6, 3, multiply)); 

		// lambda expression for single parameter 
		// This expression implements 'FuncInter2' interface 
		myFunctionInterface2 fobj = message ->System.out.println("Hello "+ message); 
		fobj.sayMessage("Good Morning"); 
	} 
} 