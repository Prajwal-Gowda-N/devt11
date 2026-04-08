package com.bnmit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testGreet() {
        assertEquals("Hello from Greeting App", App.greet());
    }
}
