package com.gortiz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void greetShouldReturnHelloMessage() {
        assertEquals("Hola, Giorgio!", App.greet("Giorgio"));
    }
}
