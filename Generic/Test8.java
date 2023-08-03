package ninteen;


	class GenDemo8<T>{
		
		T a ; 
		
			public void GenDem8(T a)
		{
				
			this.a = a ; 
		}
			
		
		public T getObject()
		{
			return a ; 
			
		}
		
	}
	
		

	public class Test8 {
	public static void main(String[] args) {
		
		
		GenDemo8<Integer> gd = new GenDemo8<>(new Integer(10));
		
		System.out.println(gd.getObject());
		}
	}
