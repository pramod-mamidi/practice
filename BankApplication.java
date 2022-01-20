import java.util.Scanner;

//CLI base Application
//Menu base 
class Employees extends Object
{

	@Override
	public String toString() {
		return "Employees [employeeID=" + employeeID + ", name=" + name + "]";
	}
	
	public void printEmployee()
	{
		System.out.println("Enlpoyee Name "+this.name);
		System.out.println("Enlpoyee ID "+this.employeeID);
	}
	public Employees(int employeeID, String name) {
		super();
		this.employeeID = employeeID;
		this.name = name;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int employeeID;
	private String name;
	
	
	
}



public class BankApplication {
	
	public static void main(String args[])
	{
		
	  //Array
		
		/*
		 * Employees value[]=new Employees[2]; Scanner sc=new Scanner(System.in);
		 * 
		 * for(int i=0;i<=1;i++) { //System.
		 * System.out.println("Enter the values for id"); int id=sc.nextInt();
		 * System.out.println("Enter the values for name"); String name=sc.next();
		 * Employees employees=new Employees(id, name); value[i]=employees; } for(int
		 * i=0;i<=1;i++) { //System.
		 * System.out.println("value on location "+value[i].toString());
		 * 
		 * }
		 */
		
		 Scanner sc=new Scanner(System.in);
		  while(true) {
			  
		  System.out.println("Select your choice");
		 
		 System.out.println("Enter 1 for create");
		 System.out.println("Enter 2 for append");
		 System.out.println("Enter 3 for delete");
		 System.out.println("Enter 4 for update");
		 System.out.println("Enter 5 for Search by name");
		 System.out.println("Enter 6 for sort ASC");
		 System.out.println("Enter 7 for sort DESC");
		 System.out.println("Enter 8 for Exit");
		 int choice= sc.nextInt();
		 if(choice==8)
		 {
			 System.err.println("Qutting the application..");
			 break;
		 }
		 
		 }
		
	}

}
