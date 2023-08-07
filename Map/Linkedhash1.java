package Map;

import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

public class Linkedhash1 {
     public static void main(String[] args) {
        HashMap<String,String> hmap = new HashMap<>();
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
