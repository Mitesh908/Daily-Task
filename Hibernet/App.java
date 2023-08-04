package com.mit.HybernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.pardha.HybernateDemo.entity.Employee;
import com.pardha.HybernateDemo.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory = HibernateUtil.buildSessionFactory();
       Session session = factory.openSession();
       Employee e = new Employee(101,"Ajay",25000,10);
       Transaction trans = session.beginTransaction();
       session.save(e);
       trans.commit();
       session.close();
       HibernateUtil.shutdown();
    }
}
