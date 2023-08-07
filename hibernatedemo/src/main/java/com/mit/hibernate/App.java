package com.mit.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mit.hibernate.dao.EmployeeDAO;
import com.mit.hibernate.entity.Address;
import com.mit.hibernate.entity.Course;
import com.mit.hibernate.entity.Department;
import com.mit.hibernate.entity.Employee;
import com.mit.hibernate.entity.Person;
import com.mit.hibernate.entity.Student;
import com.mit.hibernate.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = HibernateUtil.buildSessionFactory();
        Session session = factory.openSession();
        Course c = session.get(Course.class, "Pyhton");
        if(c!=null)
        {
        	System.out.println(c.getCourseName()+"   "+c.getCourseDuration());
        	System.out.println(c.getCourseFee()+"  "+c.getFacultyName() );
        	for(Student s : c.getStudents())
        		System.out.println(s.getStudentId()+"  "+s.getStudentName()+ " "+s.getMobileNo()+" "+s.getStudentAddress());
        }
        System.out.println("-------------------------------------");
        Student s = session.get(Student.class, 8001);
        if(s!=null)
        {
        	System.out.println(s.getStudentName()+ " " +s.getStudentId()+" "+s.getMobileNo()+ "  "+s.getStudentAddress());
        	for (Course c1 : s.getCourses())
        	{
        		System.out.println(c1.getCourseName()+" "+c1.getCourseDuration());
        	    System.out.println(c1.getCourseFee()+" "+c1.getFacultyName());			
                System.out.println();
        }
           session.close();
         }
    }
}
  //      Transaction trans = session.beginTransaction();
//        session.save(a);
//        session.save(p);
//        trans.commit();
        
      
        
            
    	
    	//    	EmployeeDAO edao = new EmployeeDAO(factory);
//    	edao.insertEmployee(new Employee(106,"Dinesh Martik",4000,40));
//    	
//    	
//    	Employee e = edao.getEmployee(103);
//    	if(e!=null)
    		
  //  	System.out.println(e.getDeptNo()+" "+e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getSalary());
//    	   edao.modifyEmployee(new Employee(106,"Ram charan",3300,40));
//    	   edao.deleteEmployee(new Employee(101,"",0,0));
//    	
    	
//    	Session session = factory.openSession();      
    //       Transaction trans = session.beginTransaction();
//        Employee e = new Employee(104," raj sharma",2000,10);
//        Employee e = session.get(Employee.class, 103);
        
        
//        if(e!=null)
//        	session.delete(e);
//        else
//        	System.out.println("employee with id 108 not exist");
//            
       // session.saveOrUpdate(e);
       //session.delete(e);
//        trans.commit();
        
       
       
//     	HibernateUtil.shutdown();
 

//insreet emp data into data
//Employee e1 = new Employee(101,"ajay saxena",1000,20);
//Employee e2 = new Employee(102,"ramesh",35000,30);
//Employee e3 = new Employee(103,"raju",5000,40);
//Transaction trans = session.beginTransaction();
//	session.save(e1);
//	session.save(e2);
//	session.save(e3);
//	trans.commit();



//check emp data 
//Employee e  = session .get(Employee.class,102);
//if(e!=null)
//	System.out.println(e.getEmployeeName()+" "+e.getDeptNo()+" "+e.getSalary()+" "+e.getEmployeeId() );
//else 
//	System.out.println("employee not exist");


//
//if(p!=null)
//{
//	System.out.println(p.getSsn()+" "+p.getPersoName()+" "+p.getPersonAge()+" "+p.getGender());
//    System.out.println(p.getAddress().getHouseNo()+" "+p.getAddress().getStreetName()+"  "+p.getAddress().getCityName()+"  "+p.getAddress().getAddressId());
//    
//}
//Address a = session.get(Address.class,7001);
//if(a!=null)
//{
//   System.out.println(a.getHouseNo()+" "+a.getCityName());
//   System.out.println(a.getStreetName()+ " "+a.getAddressId()+" "+a.getStateName());
//   System.out.println(a.getPerson().getSsn()+a.getPerson().getPersoName());
//   System.out.println(a.getPerson().getPersonAge()+" "+a.getPerson().getGender());
//   
//}


//
//Department d = session.get(Department.class, 10);
//if(d!=null)  
//{
//	  System.out.println(d.getDapartmentName()+" "+d.getLocation());
//	  for(Employee e : d.getEmployees())
//		  System.out.println(e.getEmployeeId()+ " "+e.getEmployeeName()+" "+e.getSalary());
//}
// Employee e = session.get(Employee.class,10);
// if(e!=null)
// {
//	   System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getSalary());
//	   System.out.println(e.getDepartment().getDepartmnetNo()+" "+e.getDepartment().getDapartmentName());
//	   System.out.println(e.getDepartment().getLocation());
// }
