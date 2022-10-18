package com.example.pipeline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PipelineControllerTest {

    @Test
    void hello() {
        PipelineController controller = new PipelineController(); // instance of the controller
        String response = controller.hello("Hello world"); // act
        assertEquals("Hello world", response); // assert
    }
}