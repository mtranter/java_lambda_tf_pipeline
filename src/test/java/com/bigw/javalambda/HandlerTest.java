/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.bigw.javalambda;

import org.junit.Test;
import static org.junit.Assert.*;

public class HandlerTest {
    @Test public void responseShouldEchoRequest() {
        Handler classUnderTest = new Handler();
        String expectedResult = "Hello";
        Response response = classUnderTest.handleRequest(new Request(expectedResult), null);
        assertTrue("handleRequest should echo our request", expectedResult == response.getHello());
    }
}