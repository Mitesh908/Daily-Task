package ninteen;

class GenDemo2<T>{
	Object a ; 
	
//	public GenDemo(T a)
	public GenDemo2 (Object a)
	
	{
		this.a = a ; 
		
	}
	
	public Object getObject()
	{
		return a ; 
		
	}
	
}

public class Test7 {
public static void main(String[] args) {
	GenDemo2<Integer> gd = new GenDemo2<Integer>(new Integer(100));
	Integer i = (Integer) gd.getObject();
	}
}
