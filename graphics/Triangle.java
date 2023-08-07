class Test
{
	public static void main(String[] args)
	{
	Second S = new Second();
	System.out.println(S.area(10,20));
	System.out.println(S.perimeter(10,20,30));
	}
	
}

class Second
{
	public static int area(int x , int y )
	{
    return ( x * y ) / 2; 
	}
	public static int perimeter(int x, int y , int z ) 
	{
		return x + y + z ;
		
	}
		
}