package edu.qc.seclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuggyClassTestSC2 {
    // I was able to get 100% statement coverage.
    // But I did not reveal the fault therein.
    @Test
    void buggyMethod2() {
        assertEquals(1, BuggyClass.buggyMethod2(3, 3));
        assertEquals(3, BuggyClass.buggyMethod2(3, 9));
        assertEquals(3, BuggyClass.buggyMethod2(9, 3));

    }
}