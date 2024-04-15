package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertExample {

    @Test
    public void Test1() {

        int[] resultArray = {1,2,3,4,5};
        int[] expectedArray = {1,2,3,4,5};

        Assertions.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void Test2() {

        String name = new String("Rahul");
        String expectedName = new String("Rahul");

        Assertions.assertSame(expectedName, name);
    }

    @Test
    public void Test3() {

        String name = "Rahul";
        String expectedName = "Rahul";

        Assertions.assertSame(expectedName, name);
    }

    @Test
    public void Test4() {

        boolean value = true;
        Assertions.assertTrue(value);
    }

    @Test
    public void Test5() {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(1,2,3,5,4);

        Assertions.assertIterableEquals(list1,list2);
    }

    @Test
    public void Test6() {

        Assertions.assertThrows(RuntimeException.class, () -> {

            System.out.println("This is a testing executable");
            //throw new RuntimeException("This is an exception testing");
        });
    }
}
