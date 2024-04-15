package org.example.services;

import org.junit.*;

import java.time.LocalDateTime;

public class CalculatorServiceTest {

    @BeforeClass
    public static void init() {
        System.out.println("Before all test cases");
        System.out.println("Started Test : " + LocalDateTime.now());

        // connection open || file open
    }

    @Before
    public void beforeEach() {
        System.out.println("Before each Test Case");
    }

    @After
    public void afterEach() {
        System.out.println("After each Test Case");
    }

    @Test
    public void addTwoNumbersTest() {
        System.out.println("Test for addTwoNumbers");
        int result = CalculatorService.addTwoNumbers(12, 45);
        int expected = 50;

        Assert.assertEquals(expected, result);
    }

    @Test(timeout = 2000)
    public void sumArrNumbersTest() {
        System.out.println("Test for sumArrNumbers");
        int result = CalculatorService.sumArrNumbers(2, 7, 8, 9);
        int expected = 26;

        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        Assert.assertEquals(expected, result);
    }

    @AfterClass
    public static void cleanup() {
        System.out.println("After all Test Cases");
        System.out.println("Test Cases End : " + LocalDateTime.now());

        //close connections || close file
    }
}
