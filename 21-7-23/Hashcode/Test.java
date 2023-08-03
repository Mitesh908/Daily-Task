/* 

import java.util.HashSet;
import java.util.Iterator;
class Test2 {
    public static void main(String[] args) {
       // LinkedHashSet<String> set = new LinkedHashSet<>();
       HashSet<Employee> eSet = new HashSet<>();
         
    //    set.add("Hello") ; 
    //     set.add("Welcome") ; 
    //     set.add("Apple") ; 
    //     set.add("Zebra") ; 
    //     set.add("Banana") ; 
    eSet.add(new Employee(102,"Babu",2000));
    eSet.add(new Employee(102,"Babu",2000));
    eSet.add(new Employee(102,"Babu",2000));
    eSet.add(new Employee(102,"Babu",2000));
    
        System.out.println(eSet.add(new Employee(104,"Dinesh", 4000)));
         


      //  System.out.println(set.add("trying to add apple but in thsi it wiil fail to add it" +"Apple"));
/* 
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.contains("Hello"));
*/


//         for (Employee s : eSet) {
//             System.out.println(s);
//         }

//         // iterator 
//         System.out.println("............");
//         Iterator<Employee> itr = eSet.iterator();
//         while (itr.hasNext()) {
//             System.out.println(itr.next());
//         }


//     }
// }

// hashset does not return tthe oderd of instance of elements .
//  LinedHahSet is a sub class HashSet class the base data structoure isa linked
// and the hash table unlike hashset it retains the order of insertion . 
// the object classes hashcode () generates based on the reference/address of the object . thats way it 
// should be oberridden in every class so that it generates the based 
// state of the object .


// import java.util.HashSet;
// import java.util.Iterator;
// class Test2 {

//     public static void main(String[] args) {
//         String s1 = new String ("welcome");
//         String s2 = new String("Welcame");
//         System.out.println(s1.hashCode() + " " +s2.hashCode());

//         Double d1 = 10.42 ; 
//         Double d2 = 10.46 ; 
//         System.out.println(d1.equals(d2));
//         System.out.println(d1.hashCode()+" "+d2.hashCode());
//     }

// }

// import java.util.HashSet;
// import java.util.Iterator;
// class Test2 {
//     public static void main(String[] args) {
//         Employee e1 = new Employee(102, "Babu", 2000);
//         Employee e2 = new Employee(102, "Baby", 2000);
//         System.out.println(e1.equals(e2));
//         System.out.println(e1.hashCode()+ "  "+e2.hashCode());

//     }
// }
