package ninteen;


class TypeSafetyDemo<T extends Number>
{
	T[] a; 
	public TypeSafetyDemo(T[] a ) {this.a= a;}
	public double getAverage()
	{
		double sum = 0.0 ; 
		for(int i = 0 ; i<a.length  ; i++)
			sum = sum + a[i].doubleValue();
		return sum/a.length ; 
	}
	
	public boolean areAveragesSame(TypeSafetyDemo<?> ts)
	{
		return getAverage() == ts.getAverage();
	}
	}
	

public class Test3 {
public static void main(String[] args) {
	TypeSafetyDemo<Integer> ts1  = new TypeSafetyDemo<Integer>(new Integer[] {10,20,30,40,50});
	System.out.println(ts1.getAverage());
	
	TypeSafetyDemo<Double> ts2  = new TypeSafetyDemo<Double>(new Double[] {10.0,20.0,30.0,40.0,50.0});
	System.out.println(ts2.getAverage());
	
	
	System.out.println(ts1.areAveragesSame(ts2));
}
}
