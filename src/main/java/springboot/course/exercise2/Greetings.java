package springboot.course.exercise2;

public class Greetings {
    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    public String HelloWorld() { return HELLO +" "+WORLD; }
    public String HelloWorld(String name) { return HELLO +" "+name; }
}
