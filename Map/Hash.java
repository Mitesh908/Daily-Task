package Map;

import java.util.HashMap;



public class Hash {
      public static void main(String[] args) {
        HashMap<String,String> hmap = new HashMap<>();
        hmap.put("abc@gmail.com","ABC@123");
        hmap.put("bcd@gmail.com","BCD@123");
        hmap.put("pqr@gmail.com","PQR@123");
        System.out.println(hmap.size()); //no of element
        System.out.println(hmap.containsKey("abc@gmail.com"));//if contains
        System.out.println(hmap.containsValue("RedXyz"));//if value isd there

        System.out.println(hmap.get("abc@gmail.com"));//to get value by key
/* 
        hmap.clear(); to clear all the element and value will be zero
        System.out.println(hmap.size());
*/ 

      System.out.println(hmap.remove("bcd@gmail.com","BCD@123")); //only truer and false
      System.out.println(hmap.remove("bcd@gmail.com","BCA@123"));
      
      //replace
      //System.out.println(hmap.replace("pqr@gmail.com", "PQR@123","mitesh@123"));
      
      hmap.put("bcd@gmail.com","mitesh@123");  //simple replace
      System.out.println(hmap.get("bcd@gmail.com"));

      //map.put()
      //map.get()
       //map.clear()  mapremove()   map.


      }
}
