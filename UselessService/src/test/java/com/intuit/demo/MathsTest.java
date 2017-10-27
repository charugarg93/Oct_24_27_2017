package com.intuit.demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathsTest {
    private Maths maths;

    @Before
    public void setMaths(){
        maths = new Maths();
    }
    @Test
    public void sum() throws Exception {
        assertTrue(maths.sum(10,10) == 20);
    }

}