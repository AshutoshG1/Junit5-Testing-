package com.codeWithAshutosh.serviceTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssertExample {

    //Assertion - validating actual result with expected result
    //Assertions is a class

    @Test
    public void test1(){
        System.out.println("Testing some assertions method ");
        //overloaded method
//        int actualResult = 12;
//        int expectedResult = 12;
//        Assertions.assertEquals(expectedResult, actualResult);
//        float actualResult = 12;
//        float expectedResult = 12;
//        Assertions.assertEquals(expectedResult, actualResult);
//        int actualResult = 12;
//        int expectedResult = 12;
//        Assertions.assertEquals(expectedResult, actualResult);

//        float actualResult = 12;
//        Float expectedResult = 12.0f;
//        Assertions.assertEquals(expectedResult, actualResult);

//        int [] actualIntArray = {1,2,3,4,5};
//        int [] expectedIntArray = {1,2,3,4,5};
//        Assertions.assertArrayEquals(expectedIntArray, actualIntArray);

//        String actualString = "codeWithAshutosh";
//        String expectedString = "codeWithAshutosh";
//
//        Assertions.assertSame(expectedString, actualString); //object check karega

        //Assertions.assertNotNull();
        //Assertions.assertNotNull();

//        boolean value = true;
//        Assertions.assertTrue(value);


//        List<Integer> actualList = Arrays.asList(1,2,3,4,5);
//        List<Integer> expectedList = Arrays.asList(1,2,3,4,5);
//
//        Assertions.assertIterableEquals(expectedList, actualList);

//        List<Integer> actualList = Arrays.asList(1,2,3,4,5);
//        List<Integer> expectedList = Arrays.asList(1,2,4,4,5);
//        //order changed in expected list
//
//        Assertions.assertIterableEquals(expectedList, actualList);

//        Assertions.assertThrows(RuntimeException.class, ()->{
//            throw new RuntimeException("this is runtime exceptions");
//        });

        Assertions.assertThrows(RuntimeException.class, ()->{
            System.out.println("not throwing any exceptions ");
            //throw new RuntimeException("this is runtime exceptions");
        });

    }
}
