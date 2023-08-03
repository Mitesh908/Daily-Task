import java.util.LinkedList;
class Test2 
 
{
    public static void main(String[] args) {
        LinkedList<Employee> eList = new LinkedList<>();
        eList.add(new Employee(102,"Babu",2000));
         eList.add(new Employee(104,"Dinesh",4000));
          eList.add(new Employee(106,"Ajay",6000));
           eList.add(new Employee(108,"Charan",8000));

           System.out.println(eList.remove(new Employee(104, "Jigness",4000)));
           System.out.println();
           for(Employee e : eList)
           System.out.println(e);

    }
    
}
