package edu.qc.seclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuggyClassTestBC2 {
    //As I run I was able to get more than 50% branch coverage  and I was able to reveal the fault therein.
    @Test
    public void buggyMethod2() {
        assertEquals(1, BuggyClass.buggyMethod2(5, 5));
        assertEquals(4, BuggyClass.buggyMethod2(16, 4));
        assertEquals(7, BuggyClass.buggyMethod2(7, 49));
        assertEquals(0, BuggyClass.buggyMethod2(9, 0));
    }
}