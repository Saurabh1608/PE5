package com.stackroute.unittest.pe5;

import java.util.HashMap;

public class BooleanMap {
    public HashMap<String, Boolean>arr_map(String [] str ) {
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        for(int i=0;i<str.length;i++)
        {
            if(map.get(str[i])==null)
            {
                map.put(str[i],false);
            }
            else
                map.put(str[i],true);


        }
        return map;

    }
}
