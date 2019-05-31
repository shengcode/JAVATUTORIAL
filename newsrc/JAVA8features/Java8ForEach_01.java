package JAVA8features;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
public class Java8ForEach_01 {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		//iterate over all elements
		numberList.forEach(System.out::println);
		/*
		 * The method performs the given action for each 
		 * element of the Iterable until all elements have 
		 * been processed or the action throws an exception.
		 */
		System.out.println("--------------");
		//to iterate over all elements of a stream and perform an action
		numberList.stream().filter(n -> n%2 == 0).forEach(System.out::println); // system.out is the package, println is the method
                //A custom action can be created using this simple syntax.
		System.out.println("-----Using Custom Action---------");
		Consumer<Integer> action = System.out::println;
		numberList.forEach(action);
	}

}
