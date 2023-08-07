package Map;



import java.util.Map.Entry;

import Compareemp.EmployeeEmployeeNameComparator;

import java.util.TreeMap;
import java.util.Set;

public class Emptree {
       public static void main(String[] args) {
        TreeMap<Employee,String> hmap =new TreeMap<>(new EmployeeEmployeeNameComparator());
        hmap.put(new Employee(101,"mitesh",4000), null);
        hmap.put(new Employee(102,"gitesh",3000), null);
        hmap.put(new Employee(103,"hitesh",100), null);
        hmap.put(new Employee(104,"ritesh",2000), null);


          
        Set<Entry<Employee, String>> entries = hmap.entrySet();

        for(Entry<Employee, String> e : entries)
        System.out.println(e.getKey()+ "   "+ e.getValue());
       }
}
