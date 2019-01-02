import java.util.HashMap;

public class String_count {
    public HashMap<String, Integer>no_of_count(String str ) {
        String result = str.replaceAll("[-+.^:,@___<>*?_]", " ");
        HashMap<String, Integer> map = new HashMap<>();
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
