package Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class Linkedhash {

    public static void main(String[] args) {
        
    

     LinkedHashMap<String,String> hmap = new LinkedHashMap<>();
        hmap.put("abc@gmail.com","ABC@123");
        hmap.put("bcd@gmail.com","BCD@123");
        hmap.put("pqr@gmail.com","PQR@123");
        System.out.println(hmap.size()); //no of element
        System.out.println(hmap.containsKey("abc@gmail.com"));//if contains
        System.out.println(hmap.containsValue("RedXyz"));

        Set<String> Keys = hmap.keySet();
        for(String k : Keys)
        System.out.println( k + "   "+ hmap.get(k));

        Collection<String>  values = hmap.values();
        for(String v : values)
        System.out.println(v);
    }
    
}
