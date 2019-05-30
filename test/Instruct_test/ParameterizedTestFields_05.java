package Instruct_test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//import Junit.Rectangle;

public class ParameterizedTestFields_05 {
    
    private int expectedResult;
    private int m1;
    private int m2;
    
    @Parameters
    public static Collection<Integer[]> getInputs(){
        Integer [][] arry = new Integer [][] {
                {60, 20, 10},
                {44, 10, 12},
                {138, 45, 24},
                {176, 34, 54}
        };
        return Arrays.asList(arry);
    }
    
    public ParameterizedTestFields_05 (int expectedResult, int m1, int m2){
        this.expectedResult = expectedResult;
        this.m1 = m1;
        this.m2 = m2;
    }
    
    @Test
    public void calculatePerimeterTest(){
    	MathOperations math1=new MathOperations();
       assertEquals(expectedResult, math1.addValues(m1, m2));       
       
    }
}

