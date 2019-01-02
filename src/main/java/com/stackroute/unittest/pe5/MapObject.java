package com.stackroute.unittest.pe5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

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

public class MapObject {
    public LinkedHashMap<String,String >modify(LinkedHashMap<String,String>hm)
    {
        Iterator hmIterator = hm.entrySet().iterator();
        Map.Entry mapElement = (Map.Entry)hmIterator.next();
        String key1=(String)mapElement.getKey();
        String value1=(String)mapElement.getValue();

         mapElement = (Map.Entry)hmIterator.next();

         String key2=(String)mapElement.getKey();
         String value2=(String)mapElement.getValue();

         if(value1!=null) {
             value2 = value1;
             hm.put(key1," ");
             hm.put(key2,value2);

         }
         return hm;





    }
}
