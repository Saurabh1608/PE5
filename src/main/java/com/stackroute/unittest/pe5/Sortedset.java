package com.stackroute.unittest.pe5;

import java.util.*;

public class Sortedset {

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
