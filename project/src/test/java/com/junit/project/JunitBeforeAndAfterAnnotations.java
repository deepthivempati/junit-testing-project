package com.junit.project;

import org.junit.jupiter.api.*;

public class JunitBeforeAndAfterAnnotations {
    @BeforeAll // class level annotation. applicable for static method
    static void BeforeAll(){
        System.out.println("BeforeAll Annotation");
    }
    @BeforeEach
    void BeforeTest(){
        System.out.println("Before Annotation");
    }
    @Test
    void Test1() {
        System.out.println("First Test");
    }

    @Test
    void Test2(){
        System.out.println("Second Test");
    }
    @AfterEach
    void AfterEachTest(){
        System.out.println("After Annotation");
    }

    @AfterAll //// class level annotation. applicable for static method. if the method is not static it throws an error
    static void AfterAll(){
        System.out.println("AfterAll Annotation");
    }

}
