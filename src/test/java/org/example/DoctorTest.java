package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoctorTest {

    private DoctorTest doc;
    Surgeon sur = new Surgeon("Jack","Anati",25);

    @Before
    public void setUp() throws Exception {

        doc = new DoctorTest();
    }

    @Test
    public void lname() {

        Assert.assertEquals("Jack", sur.getLname());
    }
    @Test
    public void fname(){

        Assert.assertEquals("Anati", sur.getFname());
    }

    @Test
    public void age() {
        Assert.assertEquals(25, sur.getAge());
    }

}
