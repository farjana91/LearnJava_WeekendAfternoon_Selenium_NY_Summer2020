package unittesting;

import org.junit.Assert;
import org.junit.Test;

public class TestUnitTesting2 {
    // Test case method

    @Test()
    public void testDoSummation(){
        Calculator.doSummation();

    }

    @Test
    public void testDoSubtraction(){
        //Calculator.doSubtraction(30,40);
        // Validate the expected result and Actual result
        int expectedResult=9;
        int actualResult=Calculator.doSubtraction(31,40);
       // Assert.assertEquals(expectedResult,actualResult);
       Assert.assertEquals("Test case fail",actualResult,expectedResult);
        // Assert.assertNotEquals("Test fail",actualResult,expectedResult);


    }

    @Test
    public void testDoSubtraction1(){
        //Calculator.doSubtraction(30,40);
        // Validate the expected result and Actual result
        int expectedResult=10;
        int actualResult=Calculator.doSubtraction(31,40);
        // Assert.assertEquals(expectedResult,actualResult);
        Assert.assertEquals("Test case fail",actualResult,expectedResult);
        // Assert.assertNotEquals("Test fail",actualResult,expectedResult);


    }



}
