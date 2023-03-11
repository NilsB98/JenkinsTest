package com.example.JenkinsTest.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void increment() {
        assertEquals(5, Counter.increment(4));
    }
}