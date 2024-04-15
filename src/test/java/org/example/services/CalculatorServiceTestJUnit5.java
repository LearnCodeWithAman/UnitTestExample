package org.example.services;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class CalculatorServiceTestJUnit5 {

    @BeforeAll
    public static void init() {
        System.out.println("Before all test cases");
        System.out.println("Started Test : " + LocalDateTime.now());

        //close connections || close file
    }

    @BeforeEach
    public void beforeEachTestCase() {
        System.out.println("Before each Test Case");
    }

    @AfterEach
    public void afterEachTestCase() {
        System.out.println("After each Test Case");
    }

    @Test
    @DisplayName("AddTwoNumbersTesting")
    public void addTwoNumbersTest() {
        System.out.println("First Test Case");
        int result = CalculatorService.addTwoNumbers(12, 45);
        int expected = 50;

        Assertions.assertEquals(expected, result, "Test Failed : addTwoNumbersTest");
    }

    @Test
    @Disabled
    public void sumArrNumbersTest() {
        System.out.println("Second Test Case");
        int result = CalculatorService.sumArrNumbers(2, 7, 8, 9);
        int expected = 26;

        Assertions.assertEquals(expected, result, "Test Failed : sumArrNumbersTest");
    }

    @AfterAll
    public static void cleanup() {
        System.out.println("After all Test Cases");
        System.out.println("Test Cases End : " + LocalDateTime.now());

        //close connections || close file
    }
}
