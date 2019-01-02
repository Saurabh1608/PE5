package com.stackroute.unittest.pe5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

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
