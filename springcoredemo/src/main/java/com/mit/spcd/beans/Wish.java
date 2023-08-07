package com.mit.spcd.beans;
import org.springframework.beans.factory.DisposableBean;

import org.springframework.beans.factory.InitializingBean;



public class Wish implements InitializingBean,DisposableBean
{
	
	private String message;
	
      public Wish() {
    	  System.out.println("wish bean /object created");
      }
	
	public Wish(String message)
	{
		this.message=message;
	}
	
	public void setMessage(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
	public void wishIntit() {
		System.out.println("wish bean is intialiszed");
	}
    public void wishDestroy()
    {
    	System.out.println("wish bean is about to be destroy");
    }
    public void afterPropertiesSet()
    {
    	 System.out.println("fromafterpropertiesset method");
    }
    public void destroy()
    {
    	System.out.println("from disposablebean.destory()");
    }
}
