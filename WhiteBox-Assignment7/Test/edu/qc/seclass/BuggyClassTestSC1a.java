package edu.qc.seclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuggyClassTestSC1a {
    // I was able to get 100% statement coverage.
    // And it did not revealed the fault therein.
    @Test
    public void buggyMethod1() {
        assertEquals(1, BuggyClass.buggyMethod1(5, 5));
        assertEquals(5, BuggyClass.buggyMethod1(5, 25));
        assertEquals(5, BuggyClass.buggyMethod1(25, 5));
    }
}