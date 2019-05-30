package Instruct_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class tcMathOperationSubtractValues_02 {
	MathOperations math1;
	int actual;
	
	@Before
	public void setUp(){
		math1=new MathOperations();
		System.out.println("---- Executed before each Test Method ---");
	}
	
	@After
	public void tearDown(){
		math1=null;
		System.out.println("---- Test Case Done ---");
	}
	
	@Test	
	public void testSubtractValuesPositive(){
		actual=math1.subtractValues(10, 20);
		Assert.assertEquals(-10, actual);
	}
	
	@Test(timeout=1)
	public void testSubtractValuesNegative(){
		actual=math1.subtractValues(-10, -20);
		Assert.assertEquals(10, actual);
	}
	
	@Test
	public void testSubtractValuesMixedValues1(){
		actual=math1.subtractValues(-10, 20);
		Assert.assertEquals(-30, actual);
	}
	
	@Test
	public void testSubtractValuesMixedValues2(){
		actual=math1.subtractValues(10, -20);
		Assert.assertEquals(30, actual);
	}

}
