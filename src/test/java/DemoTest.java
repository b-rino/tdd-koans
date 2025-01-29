import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @DisplayName("Requirement 1")
    @Test
    public void test1(){
        Demo demo = new Demo();
        String actual = demo.greet("Bob");
        String expected = "Hello, Bob";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}