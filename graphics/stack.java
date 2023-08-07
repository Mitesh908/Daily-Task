class Test {
	public static void main(String[] args) {
	stack<Integer> stk = new stack<Integer>();
	
	boolean result = stk.empty();
	 
	System.out.println("the stack is  empty : " + result);
	
	
    for(int i=0;i<=10;i++) {
		stk.push(i);
	}
	 System.out.println("element in stack : " + stack );
	 result=stk.empty();
	 
	}
}
		
		