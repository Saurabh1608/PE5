package com.stackroute.unittest.pe5;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;


/* Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list
Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive*/

public class SortedSetTest {
    SortedSet obj;
    @Before
    public void setUp() throws Exception {
        obj=new SortedSet();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void sort_set() {
        HashSet<String> set=new HashSet<>();
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        set.add("Harry");
        set.add("Olive");

        ArrayList<String> arr=new ArrayList<>();
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Eugene");
        arr.add("Harry");
        arr.add("Olive");
     assertEquals(arr,obj.sort_set(set));
    }


    @Test
    public void sort_setFailure() {
        HashSet<String> set=new HashSet<>();
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");
        set.add("Harry");
        set.add("Olive");
        set.add("Keshav");
        set.add("Kumar");

        assertNotNull("Error",obj.sort_set(set));

    }

}