package Map;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Set;



public class Treema {
     public static void main(String[] args) {
        
     
    TreeMap<String,String> hmap = new TreeMap<>();
        hmap.put("abc@gmail.com","ABC@123");
        hmap.put("bcd@gmail.com","BCD@123");
        hmap.put("pqr@gmail.com","PQR@123");
        System.out.println(hmap.size()); //no of element
        System.out.println(hmap.containsKey("abc@gmail.com"));//if contains
        System.out.println(hmap.containsValue("RedXyz"));

        
        Set<Entry<String, String>> entries = hmap.entrySet();

        for(Entry<String, String> e : entries)
        System.out.println(e.getKey()+ "   "+ e.getValue());
     }

}
