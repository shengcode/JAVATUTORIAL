package JAVA8features;

/*
 * Java 8 allows you to add non-abstract methods in interfaces. 
 * These methods must be declared default methods. 
 * Default methods were introduces in java 8 to enable the functionality 
 * of lambda expression.
 * If you do not override them, they are the methods 
 * 	which will be invoked by caller classes
 */

public interface Java8DefaultMethods_06 {
	default void display(){
		System.out.println("Default Method display");
	}
	//If any class implements this interface then it need not 
	//to implement it�s own version of the method. 
	//It can directly call instance.display();
}