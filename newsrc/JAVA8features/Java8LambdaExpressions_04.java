package JAVA8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * Lambda expression (or function) is just an anonymous function
 * , i.e., a function with no name and without being bounded 
 * to an identifier.
 * 
 * A typical lambda expression syntax will be like this:
		(x, y) -> x + y� 
	This function takes two parameters and return their sum.
	
	The other possible syntaxes of a lambda expression are:
either
�
(parameters) -> expression�//1�
or
(parameters) -> { statements; }� //2�
or �
() -> expression�//3
 */

public class Java8LambdaExpressions_04 {

	public static void main(String[] args) {
		List<String> pointList = new ArrayList();
		pointList.add("1");
		pointList.add("2");

		pointList.forEach(p ->{System.out.println(p);});
	}
	
	/*
	 *  some examples are:
		(int a, int b) -> a * b�
		// takes two integers and returns their multiplication
�
		(a, b)->a - b
		// takes two numbers and returns their difference
�
		() -> 99
		// takes no values and returns 99
�
		(String a) -> System.out.println(a)
		// takes a string, prints its value to the console, and returns nothing 
�
		a -> 2 * a
		// takes a number and returns the result of doubling it
�
		c -> { //some complex statements }
		// takes a collection and do some procesing

	 */

}
