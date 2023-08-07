package inheritance.strategy.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mit.hibernate.util.HibernateUtil;


public class App2 {

	public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	
	HourlyWagesEmployee hourlyWagesEmployee = new HourlyWagesEmployee(102,"charan",45,500);
	SalariedEmployee salariedEmployee = new SalariedEmployee(101,"Ajay",10000);
	
	
	Transaction transaction = session.beginTransaction();
	
	session.save(hourlyWagesEmployee);
	session.save(salariedEmployee);
	
	transaction.commit();
	
	
	session.close();
	HibernateUtil.shutdown();
	
	}

}
