package Map;

import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

class Emphash
{
    public static void main(String[] args) {
        HashMap<Employee,String> hmap =new HashMap<>();
        hmap.put(new Employee(101,"mitesh",4000), null);
        hmap.put(new Employee(102,"mitesh",4000), null);
        hmap.put(new Employee(103,"mitesh",4000), null);
        hmap.put(new Employee(104,"mitesh",4000), null);


        Set<Employee> keys = hmap.keySet();
        for(Employee k : keys)
        System.out.println(k+ "  "+ hmap.get(k));

        Collection<String> values = hmap.values();
        for(String v : values)
        System.out.println(v);
    }
}

