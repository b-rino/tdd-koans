import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    Demo demo = new Demo();

    @DisplayName("Requirement 1")
    @Test
    public void test1(){
        String actual = demo.greet("Bob");
        String expected = "Hello, Bob";
        assertEquals(expected, actual);
    }

    @DisplayName("Requirement 2")
    @Test
    public void test2(){
        String actual = demo.greet(null);
        String expected = "Hello, my friend";
        assertEquals(expected, actual);
    }

    @DisplayName("Requirement 3")
    @Test
    public void test3(){
        String actual = demo.greet("JERRY");
        String expected = "HELLO, JERRY";
        assertEquals(expected, actual);
    }

    @DisplayName("Requirement 4")
    @Test
    public void test4(){
        String[] names = {"Thomas", "Benjamin"};
        String actual = demo.greet(names);
        String expected = "Hello, Thomas and Benjamin";
        assertEquals(expected, actual);
    }

    @DisplayName("Requirement 5")
    @Test
    public void test5(){
        String[] names = {"Thomas", "Benjamin", "Peter"};
        String actual = demo.greet(names);
        String expected = "Hello, Thomas, Benjamin and Peter";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}