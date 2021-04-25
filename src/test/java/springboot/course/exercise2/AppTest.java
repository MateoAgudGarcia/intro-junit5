package springboot.course.exercise2;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    void testHelloWorld(){
        assertEquals("Hello World",new Greetings().HelloWorld());
    }

    @Test
    void testHelloName(){
        assertEquals("Hello Mateo",new Greetings().HelloWorld("Mateo"));
    }
}
