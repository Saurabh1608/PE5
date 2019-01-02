package com.stackroute.unittest.pe5;

import java.util.ArrayList;
import java.util.Arrays;

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
        ArrayList<String> list=new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));



        ArrayList<String>list1=new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "kiwi","Berry"}));


        assertEquals(list1,obj.update(list,2,"kiwi"));


    }


    @org.junit.Test
    public void replacingStringIsNull() {
        ArrayList<String> list=new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));

        ArrayList<String>list1=new ArrayList<String>(Arrays.asList(new String[]{" ", "Grape", "Melon","Berry"}));


        assertEquals(list1,obj.update(list,0," "));


    }

    @org.junit.Test
    public void arrayStringIsNull() {
        ArrayList<String> list=new ArrayList<String>(Arrays.asList(new String[]{" "}));

        ArrayList<String>list1=new ArrayList<String>(Arrays.asList(new String[]{"Grape"}));


        assertEquals(list1,obj.update(list,0,"Grape"));


    }




    @org.junit.Test
    public void remove() {
        ArrayList<String> list=new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));


        ArrayList<String>list1=new ArrayList<String >();
        assertEquals(list1,obj.remove(list));

    }
}