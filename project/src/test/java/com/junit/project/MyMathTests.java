package com.junit.project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MyMathTests {
    private MyMath math = new MyMath();
    @Test
    void test(){
        assertEquals(21, math.calculateSum(new int[] {1,2,3,4,5,6}));
    }
    @Test
    void test1(){
        assertEquals(0, math.calculateSum(new int[] {}));
    }

    @Test
    void Test2() {
        int[] numbers = {1,2,3,4,5,6};
        MyMath test = new MyMath();
        int result = test.calculateSum(numbers);
        //System.out.println(result);
        //int expectedResult = 22;
        int expectedResult = 21;
        assertEquals(expectedResult, result);
    }
}
