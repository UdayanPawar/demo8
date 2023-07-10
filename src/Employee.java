
public class Employee {
	
	private int empId; //declaration of global variable
	public String empName;
	String companyName;
	protected String address;
	
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();//emp1=obj name
		emp1.empId = 101 ;		//printing val of obj(provide val here or for glob var) 
		emp1.empName = "Arun"; 
		
		Employee emp2 = new Employee();
		emp2.empId = 201 ;
		emp2.empName = "Arun"; 
		
	}
	
	

}
