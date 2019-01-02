package com.stackroute.unittest.pe5;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class BooleanMapTest {
  BooleanMap obj;
    @Before
    public void setUp() throws Exception {
        obj=new BooleanMap();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void arr_map() {
        String  arr[] = {"a","b","c","d","a","c","c"};
        HashMap<String, Boolean> map = new HashMap<>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        assertEquals(map,obj.arr_map(arr));
    }

    @Test
    public void arr_mapNull() {
        String  arr[] = {" "};
        HashMap<String, Boolean> map = new HashMap<>();
        map.put(" ",false);
        assertEquals(map,obj.arr_map(arr));
    }
}