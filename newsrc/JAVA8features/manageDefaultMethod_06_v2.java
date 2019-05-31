package JAVA8features;

/*
 * if class willingly wants to customize the behavior then 
 * it can provide it�s own custom implementation and 
 * override the method. Now it�s own custom method will be 
 * called.
 */
public class manageDefaultMethod_06_v2 implements Java8DefaultMethods_06{
	public void display(){
		System.out.println("I am displaying on a Mobile App");
	}
	public static void main(String[] args){
		manageDefaultMethod_06_v2 method1 = new manageDefaultMethod_06_v2();
		method1.display();
	}
}
