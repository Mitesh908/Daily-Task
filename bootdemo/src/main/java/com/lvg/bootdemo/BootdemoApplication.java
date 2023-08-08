package com.lvg.bootdemo;

//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//import com.lvg.bootdemo.beans.Bookstore;
//import com.lvg.bootdemo.beans.Person;
import com.lvg.bootdemo.entity.Book;
import com.lvg.bootdemo.entity.Department;
import com.lvg.bootdemo.entity.Employee;
import com.lvg.bootdemo.repository.BookRepository;
import com.lvg.bootdemo.repository.DepartmentRepository;
import com.lvg.bootdemo.service.DepartmentService;

@SpringBootApplication
public class BootdemoApplication {
    @Autowired
    static BookRepository bookRepository;
	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(BootdemoApplication.class, args);
      //  DepartmentRepository dr =container.getBean(DepartmentRepository.class);
       //Optional<Department> d = dr.findById(20);
		DepartmentService ds =container.getBean(DepartmentService.class);
		Department d1 = ds.getDepartmentByDepartmentId(20);
//        if(d.isPresent())
//        {
        	//Department d1 = d.get();
          System.out.println("Result:  "+d1.getDepartmentNo()+" "+d1.getDepartmentName()+" "+d1.getLocation());
           for(Employee e : d1.getEmployees())
        	System.out.println("Result: "+e.getEmployeeId()+ " "+ e.getEmployeeName()+" "+e.getSalary());
        	
        
		
		
		
		
// for book abstract method		
//		BookRepository bookRepository = container.getBean(BookRepository.class);
//	    Optional<Book> b = bookRepository.findByBookPrice(600);
//	    if(b.isPresent())
//	    	 System.out.println(" RESULT: -"+b.get().getBookTitle()+" "+b.get().getBookId()+" "+b.get().getBookAutor()+b.get().getBookCategory()+" "+b.get().getBookPrice()+" "+b.get().getAvailablecopies());
//	     else
//	         System.out.println("not found");
//		
		
//		List<Book> blist = bookRepository.findByTitle("Java");
//	    for(Book b1 : blist)
//	    	 System.out.println(" RESULT: -"+b1.getBookTitle()+" "+b1.getBookId()+" "+b1.getBookAutor()+b1.getBookCategory()+" "+b1.getBookPrice()+" "+b1.getAvailablecopies());
//		
//	 	TO FETCH BOOK BY ID
//		Optional<Book> b = bookRepository.findById("M1"); 
//	     if(b.isPresent())
//	    	 System.out.println(" RESULT: -"+b.get().getBookTitle()+" "+b.get().getBookId()+" "+b.get().getBookAutor()+b.get().getBookCategory()+" "+b.get().getBookPrice()+" "+b.get().getAvailablecopies());
//	     else
//	         System.out.println("not found");
		
//      To add book in table
//		Book b = new Book("HCP","PYHTON WOLRD","Dietel","Python",700,10);
//	    bookRepository.save(b);
    		
//		to delete book
//		bookRepository.deleteById("COD");
				
//		to get all book
//		List<Book> books  = bookRepository.findAll();
//		for(Book  b : books)
//			System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAutor()+" "+b.getBookCategory()+ " "+b.getBookPrice()+" "+b.getAvailablecopies());
//		
		//System.out.println("hello from Spring Boot");
		
//		Person p = container.getBean(Person.class);
//		if(p!=null)
//			System.out.println(p.getSsn()+" "+p.getName()+" "+p.getAge());
//		    System.out.println(p.getAddress().getHno()+" "+p.getAddress().getStreet());
//		    System.out.println(p.getAddress().getCity()+" "+p.getAddress().getState());
//		
//		Bookstore b = container.getBean(Bookstore.class);
//		if(b!=null)
//			System.out.println(b.getBookId()+" "+b.getBookType()+" "+b.getPrice());
//		System.out.println(b.getBook().getBookid()+"  "+b.getBook().getBookName()+" "+b.getBook().getBookAuthor());
	}

}
