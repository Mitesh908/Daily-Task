package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;


public class HMap {   // TO get all the entry
      public static void main(String[] args) {
        
        HashMap<String,String>hmap = new LinkedHashMap<>();
        hmap.put("ABC@gmail.com","abc@123");
         hmap.put("BCD@gmail.com","abc@123");
          hmap.put("EFG@gmail.com","abc@123");
           hmap.put("PQR@gmail.com","abc@123");

           Set<Entry<String,String>>entries = hmap.entrySet();

           for(Entry<String,String> e : entries)
              System.out.println(e.getKey()+"   "+e.getValue());
      


      }
}
