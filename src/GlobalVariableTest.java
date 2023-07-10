
public class GlobalVariableTest {
	
	int x ; //declaration of global var. x
	
	int y = 20 ; //initialization of global var. 
	
	String str ;
	
	 
	
	public static void main(String[] args) {
		GlobalVariableTest test = new GlobalVariableTest();
		test.x = 100; //initializn of GV x
		
		System.out.println(test.x); //100 
		System.out.println(test.y); //100 
		System.out.println(test.str);
		
		
	}

}
