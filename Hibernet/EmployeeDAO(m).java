package com.mit.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mit.hibernate.entity.Employee;
import com.mit.hibernate.util.HibernateUtil;

public class EmployeeDAO {
	  SessionFactory factory = null;
	  public EmployeeDAO(SessionFactory factory)
	  {
		  this.factory = factory;
	  }
	  public void insertEmployee(Employee employee)
	  {
		  Session session = factory.openSession();
		  Transaction trans = session.beginTransaction();
		  try {
			   session.save(employee);
			   trans.commit();
		  }
		  catch(Exception ex)
		  {
			  trans.rollback();
			  ex.getStackTrace();
		  }
	  }
	  public void deleteEmployee(Employee employee)
	  {
		  Session session = factory.openSession();
		  Transaction trans = session.beginTransaction();
		  try {
			   session.delete(employee);
			   trans.commit();
		  }
		  catch(Exception ex)
		  {
			  trans.rollback();
			  ex.getStackTrace();
		  }
	  }
	  public void modifyEmployee(Employee employee)
	  {
		  Session session = factory.openSession();
		  Transaction trans = session.beginTransaction();
		  try {
			   session.update(employee);
			   trans.commit();
		  }
		  catch(Exception ex)
		  {
			  trans.rollback();
			  ex.getStackTrace();
		  }
	  }

	  public Employee getEmployee(int employeeId)
	  {
		  Session session = factory.openSession();
		   return session.get(Employee.class, employeeId);
		  
	  }
}
