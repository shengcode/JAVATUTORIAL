package JAVA8features;

import java.util.ArrayList;
import java.util.List;

/*
Why Deafult Methods?
Lambda expression are essentially of type of functional 
interface. To support lambda expressions seamlessly, 
all core classes have to be modified. 
But these core classes like java.util.List are implemented 
not only in JDK classes, but also in thousands of client 
code as well. Any incompatible change in core classes will 
back fire for sure and will not be accepted at all.Default 
methods break this deadlock and allow adding support for 
functional interface in core classes. 


For Example:Before java 8, if you had to iterate on a java collection then 
your would get an iterator instance and call it�s next method until hasNext() 
returns false. This is common code and have been used thousands of time in day 
to day programming by us. Syntax is also always same. 
So can we make it compact so that it takes only single line of code and 
still do the job for us as before. Above function does that.
Now to iterate and perform some simple operation on every item in list, 
all you need to do is:
*/
public class manageDefaultMethod_06_v3 implements Java8DefaultMethods_06{
	public static void main(String[] args){
		List<manageDefaultMethod_06_v3> myList = new ArrayList();
		myList.add(new manageDefaultMethod_06_v3());
		myList.add(new manageDefaultMethod_06_v3());
		myList.add(new manageDefaultMethod_06_v3());
		
		//Iterator code reduced to one line
		myList.forEach((Java8DefaultMethods_06 p) -> p.display());
		
		//So here, an additional method has been added to List without 
		//breaking any custom implementations of it. 
	}
}
