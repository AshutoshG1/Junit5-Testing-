package com.codeWithAshutosh.serviceTest;

import com.codeWithAshutosh.service.CalculatorService;
import org.junit.jupiter.api.*;

public class CalculatorServiceTest {

    @BeforeAll
    public static void init(){
        System.out.println("Before all test cases :");
        //connection
        //file open
    }

    @BeforeEach
    public void beforeEachTest(){
        System.out.println("Before each test case");
    }

    @AfterEach
    public void afterEachTest(){
        System.out.println("AFter each test case :");
    }

    @Test
    @DisplayName("This is custom test name ")
    public void addTwoNumbersTest(){
        System.out.println("test case addTwoNumbersTest");
        int actualResult = CalculatorService.addTwoNumbers(10,20);
        int expectedResult = 30;
        Assertions.assertEquals(expectedResult, actualResult, "test failed");
    }

    @Test
    @Disabled
    public void subtractTwoNumbersTest(){
        System.out.println("test case subtractTwoNumbersTest");
        int actualResult = CalculatorService.subtractTwoNumbers(40,20);
        int expectedResult = 20;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void multiplyTwoNumbersTest(){
        System.out.println("test case multiplyTwoNumbersTest");
        int actualResult = CalculatorService.multiplyTwoNumbers(10,20);
        int expectedResult = 200;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divideTwoNumbersTest(){
        System.out.println("test case divideTwoNumbersTest");
        int actualResult = CalculatorService.divideTwoNumbers(400,20);
        int expectedResult = 20;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sumAnyNumbersTest(){
        int actualResult = CalculatorService.sumAnyNumbers(1,2,3,4);
        int expectedResult = 10;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After all test cases :");
        //close connections
        //close file
    }

    // @Tag()
    //@Nested
    //@TestFactory
}
