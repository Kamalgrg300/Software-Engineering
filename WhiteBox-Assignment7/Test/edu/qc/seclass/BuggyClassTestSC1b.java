package edu.qc.seclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuggyClassTestSC1b {
    // I was able to get below 50% in statement coverage,
    // and it reveals the fault therein
    @Test
    void buggyMethod1() {
        assertEquals(1, BuggyClass.buggyMethod1(3, 3));
        assertEquals(3, BuggyClass.buggyMethod1(3, 9));
        assertEquals(3, BuggyClass.buggyMethod1(9, 3));
    }
}