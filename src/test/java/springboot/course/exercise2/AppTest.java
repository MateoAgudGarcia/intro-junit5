package springboot.course.exercise2;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Greetings greetings;

    @BeforeAll
    static void initTest(){
        System.out.println("Before everything");
    }
    @BeforeEach
    void setTest(){
        greetings = new Greetings();
    }

    @Test
    void testHelloWorld(){
        assertEquals("Hello World",greetings.HelloWorld());
    }

    @Test
    void testHelloName(){
        assertEquals("Hello Mateo",greetings.HelloWorld("Mateo"));
    }

    @AfterAll
    static void tearDown(){
        System.out.println("Last line in class");
    }
}
