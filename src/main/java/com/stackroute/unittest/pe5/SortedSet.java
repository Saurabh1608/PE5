package com.stackroute.unittest.pe5;

import java.util.*;


/* Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list
Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive*/

public class SortedSet {

    public ArrayList<String> sort_set(HashSet<String>hash_Set)
    {
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        Iterator<String> it=tree_Set.iterator();
        ArrayList<String>list1=new ArrayList<String>();
        while(it.hasNext())
        {
            list1.add(it.next());
        }
        return list1;

    }
}
