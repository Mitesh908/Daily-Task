package Map;

import java.util.HashMap;

public class UserDef {

    public static void main(String[] args) {

        HashMap<String,String> hmap = new HashMap<>();
        hmap.put("abc@gmail.com","ABC@123");
        hmap.put("bcd@gmail.com","BCD@123");
        hmap.put("pqr@gmail.com","PQR@123");

        System.out.println(hmap+"  ");
    }
     
}
