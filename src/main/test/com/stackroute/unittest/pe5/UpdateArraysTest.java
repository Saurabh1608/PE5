package com.stackroute.unittest.pe5;

import java.util.ArrayList;

import static org.junit.Assert.*;

/* Write a Java program to update specific array element by given element and empty the array list .
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []   */



public class UpdateArraysTest {
    UpdateArrays obj;

    @org.junit.Before
    public void setUp() throws Exception {
        obj=new UpdateArrays();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        obj=null;
    }

    @org.junit.Test
    public void update() {
        ArrayList<String> list=new ArrayList<String >();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");

        ArrayList<String>list1=new ArrayList<String>();
        list1.add("Apple");
        list1.add("Grape");
        list1.add("kiwi");
        list1.add("Berry");

        assertEquals(list1,obj.update(list,2,"kiwi"));


    }


    @org.junit.Test
    public void updateFailure() {
        ArrayList<String> list=new ArrayList<String >();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");


        assertNotNull("Error",obj.update(list,0,"kiwi"));


    }

    @org.junit.Test
    public void remove() {
        ArrayList<String> list=new ArrayList<String >();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");

        ArrayList<String>list1=new ArrayList<String >();
        assertEquals(list1,obj.remove(list));

    }
}