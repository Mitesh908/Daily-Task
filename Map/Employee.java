package Map;
class Employee
{
      private int employeeId;
      private String employeeName;
      private double salary;
      public Employee() {}
      public Employee(int employeeId,String employeeName,double salary)
      {
        this.employeeId =employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
       }

       public int getEmployeeId() {return employeeId;}
       public String getEmployeeName() {return employeeName;}
       public double getSalary() {return salary;}


       public String toString()
      {
        return employeeId+"   "+employeeName+"   "+salary;

       }


     public boolean equals(Object obj)
     {
        if(obj instanceof   Employee)
        {
            System.out.println("from employee class equals methhods");
            Employee e =(Employee) obj;
            return employeeId == e.employeeId &&employeeName.equals(e.employeeName) && salary == e.salary;
        }
        return false;
     }
}
