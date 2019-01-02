package com.stackroute.unittest.pe5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;
/* Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:
a. If the key `val1` has
b. Set the key `val1` to
Example 1:
The map {"val1": "java",
"java"}
Example 2:
The map {"val1": "mars",
"mars"}
a value, set the key `val2` to have that value, and
have the value `" "` (empty string ).
"val2": "c++"} should return {"val1": " ", "val2":
"val2": "saturn"}
should return {"val1": " ", "val2": */
public class MapObjectTest {
     MapObject obj;
    @Before
    public void setUp() throws Exception {
        obj=new MapObject();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void modify() {
        LinkedHashMap<String ,String> hm=new LinkedHashMap<>();
        hm.put("val1","java");
        hm.put("val2","c++");
        HashMap<String ,String>res=new HashMap<>();
        res.put("val1"," ");
        res.put("val2","java");

        assertEquals(res,obj.modify(hm));
    }
    @Test
    public void modify1() {
        LinkedHashMap<String ,String> hm=new LinkedHashMap<>();
        hm.put("val1","mars");
        hm.put("val2","saturn");
        HashMap<String ,String>res=new HashMap<>();
        res.put("val1"," ");
        res.put("val2","mars");

        assertEquals(res,obj.modify(hm));
    }

}