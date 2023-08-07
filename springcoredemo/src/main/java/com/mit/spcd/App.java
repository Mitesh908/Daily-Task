package com.mit.spcd;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mit.spcd.beans.Person;
import com.mit.spcd.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    { 
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class); 
        Person p = container.getBean(Person.class);
        System.out.println(p.getSsn()+"   "+p.getName()+"   "+p.getAge());
        System.out.println(p.getAddress().getHno()+"  "+p.getAddress().getStreetName());
        System.out.println((p.getAddress().getCity()+"  "+p.getAddress().getState()));
      
        container.close();
    }
}




//FileSystemXmlApplicationContext container = new FileSystemXmlApplicationContext("c:\\users\\desktop\\spring\\beans.xml");
//Person p = container.getBean("per1",Person.class);
//System.out.println(p.getSsn()+"   "+p.getName()+"   "+p.getAge());
//System.out.println(p.getAddress().getHno()+"  "+p.getAddress().getStreetName());
//System.out.println((p.getAddress().getCity()+"  "+p.getAddress().getState()));
//
//
//Country c = container.getBean("ctry",Country.class);
//System.out.println("Country Name   :-" +c.getCountryName());
//System.out.println("Currency Name  :-" + c.getCurrencyName());
//System.out.println("states  :- " );
//for(Entry<String,String> e : c.getStates().entrySet())
//	System.out.println(e.getKey()+"  "+e.getValue());
//


//Wish w1 = container.getBean("wish1",Wish.class);
//System.out.println(w1.getMessage());
//
//Wish w2 = container.getBean("wish1",Wish.class);
//w2.setMessage("spring welcome you");
//System.out.println(w1.getMessage());
//System.out.println(w2.getMessage());
//container.close();