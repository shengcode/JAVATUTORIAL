package Instruct_test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTestFields_04 {
    // fields used together with @Parameter must be public
    @Parameter(0)
    public int m1;
    @Parameter(1)
    public int m2;
    @Parameter(2)
    public int result;

    // creates the test data
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 10 , 20, 30 },{ 5, 3, 8 }, { 121, 4, 125 } };
        return Arrays.asList(data);
    }
    @Test
    public void testAddValuesUsingParameters() {
    	MathOperations math1=new MathOperations();
    	Assert.assertEquals("Result", result, math1.addValues(m1, m2));        
    }    
}
