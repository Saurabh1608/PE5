package com.stackroute.unittest.pe5;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

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
        HashSet<String> set=new HashSet<String>(Arrays.stream(new String[]{"Alice", "Bluto", "Eugene","Harry","Olive"}).collect(Collectors.toCollection(HashSet::new)));



        ArrayList<String> arr=new ArrayList<String>(Arrays.asList(new String[]{"Alice", "Bluto", "Eugene","Harry","Olive"}));

         assertEquals(arr,obj.sort_set(set));
    }


    @Test
    public void sort_setNull() {
        HashSet<String> set=new HashSet<String>(Arrays.stream(new String[]{" "}).collect(Collectors.toCollection(HashSet::new)));

        ArrayList<String> arr=new ArrayList<String>(Arrays.asList(new String[]{" "}));


        assertEquals(arr,obj.sort_set(set));

    }

    @Test
    public void sort_setOneElement() {
        HashSet<String> set=new HashSet<String>(Arrays.stream(new String[]{"Sam"}).collect(Collectors.toCollection(HashSet::new)));

        ArrayList<String> arr=new ArrayList<String>(Arrays.asList(new String[]{"Sam"}));


        assertEquals(arr,obj.sort_set(set));

    }

}