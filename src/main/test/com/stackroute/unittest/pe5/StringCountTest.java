package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class StringCountTest {
    StringCount obj;
    @Before
    public void setUp() throws Exception {
        obj=new StringCount();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void no_of_count() {
        String str="one one -one___two,,three,one @three*one?two";
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);

        assertEquals(map,obj.no_of_count(str));

    }

    @Test
    public void no_of_countNull() {
        String str=" ";
        HashMap<String, Integer> map = new HashMap<>();


        assertEquals(map,obj.no_of_count(str));

    }
}