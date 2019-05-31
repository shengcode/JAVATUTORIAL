package JAVA8features;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Java8LambdaExpressions_05_v1 { 
	public static void main(String args[]){ 
		//Implementation of Abstract Method from Interface
		FuncInterface fobj = (int x)->System.out.println(2*x);; 
		// This calls above lambda expression and prints 10. 
               
		fobj.abstractFun(5);;
		
		
		// there is a FuncInterface abstract class with abstractFun abstract function
		// so you can have this kind of implementations etc;
		
		FuncInterface fobj1= (int x)-> System.out.println(x*x*10);
		fobj1.abstractFun(5);
	} 
} 