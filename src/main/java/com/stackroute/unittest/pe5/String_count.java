package com.stackroute.unittest.pe5;

import java.util.HashMap;
/*Write a program to find the number of counts in the following String . Store the output in
Map< String ,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}*/


public class String_count {

    public HashMap<String, Integer>no_of_count(String str ) {

        String result = str.replaceAll("[-+.^:,@___<>*?_]", " ");

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        String []str1=result.split("[\\s]");

        for(int i=0;i<str1.length;i++)
        {

            if(map.get(str1[i])==null)
            {
                map.put(str1[i],1);
            }
            else
                map.put(str1[i],map.get(str1[i])+1);
        }
        map.remove("");
        return map;


    }

}
