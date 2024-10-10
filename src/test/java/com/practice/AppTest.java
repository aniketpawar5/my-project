package com.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;




public class AppTest {


	@Test
    public void testGreet() {
        App app = new App();
        String result = app.greet("Jenkins");
        assertEquals("Hello, Jenkins", result);
    }
	
}
