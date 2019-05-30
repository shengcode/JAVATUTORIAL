package Instruct_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class tcMathOperationAddValues_01 {
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
	
	@Ignore
	@Test	
	public void testAddValuesPositive(){
		//MathOperations math1=new MathOperations();
		actual=math1.addValues(10, 20);
		Assert.assertEquals(30, actual);
	}
	
	@Test(timeout=1)
	public void testAddValuesNegative(){
		//MathOperations math1=new MathOperations();
		actual=math1.addValues(-10, -20);
		Assert.assertEquals(-30, actual);
	}
	
	@Test
	public void testAddValuesMixedValues1(){
		//MathOperations math1=new MathOperations();
		actual=math1.addValues(-10, 20);
		Assert.assertEquals(10, actual);
	}
	
	@Test
	public void testAddValuesMixedValues2(){
		//MathOperations math1=new MathOperations();
		actual=math1.addValues(10, -20);
		Assert.assertEquals(-10, actual);
	}
	
	@Test
	public void testAddValuesMixedValues3(){
		//MathOperations math1=new MathOperations();
		String N_actual=math1.addValues("Hello", "B");
		Assert.assertEquals("HelloB", N_actual);
	}

}
