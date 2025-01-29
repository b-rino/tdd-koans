import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}