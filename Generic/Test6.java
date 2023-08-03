package ninteen;

	import eighteenjuly.Employee;

	interface GenDemo1<T>
	{
		void printArray(T[] a) ; 
		
	}

	class GenDemoImpl1<T> implements GenDemo<String>
	{
		public void printArray(String[] a)
		{
			for(int i= 0 ; i<a.length; i++)
				System.out.println(a[i]);
			
		}
	}
	
	
	
	public class Test6 {
	 public static void main(String[] args) {
		 
		GenDemoImpl<String> gdl = new GenDemoImpl<String>();
			
		gdl.printArray(new String[] {"welcome","hello","bye bye"}) ; 
			
		Employee[] earr = {new Employee(102, "Babu",2000), new Employee(103,"Charan",3000),new Employee(101,"Ajay",1000)};
		
		GenDemoImpl<Employee> gd2 = new GenDemoImpl<Employee>();
		
		gd2.printArray(earr);
	 }
	}
	
	
