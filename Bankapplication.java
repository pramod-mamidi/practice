package com.bajaj.helloworld;

import java.util.*;

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


public class Bankapplication {
	ArrayList<Employees> obj_list=new ArrayList<Employees>();
	void create(int emp_id,String name){
		Employees obj=new Employees(emp_id,name);
		obj_list.add(obj);
		System.out.println(obj_list);
	}
	void append(int emp_id,String name){
		Employees obj=new Employees(emp_id,name);
		obj_list.add(obj);
		System.out.println(obj_list);
	}
	void delete(int emp_id) {
		for(int i=0;i<obj_list.size();i++) {
			if(obj_list.get(i).getEmployeeID()==emp_id) {
				obj_list.remove(i);
			}
		}
		System.out.println(obj_list);
	}
	void update(int emp_id,String name){
		for(int i=0;i<obj_list.size();i++) {
			if(obj_list.get(i).getEmployeeID()==emp_id) {
				obj_list.get(i).setName(name);
			}
		}
		System.out.println(obj_list);
	}
	void searchbyname(String name){
		int flag=0;
		for(int i=0;i<obj_list.size();i++) {
			if(obj_list.get(i).getName().equals(name)) {
				System.out.println("name found");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("name not found");
		}
	}
	void sortAsc(){
		for(int i=0;i<obj_list.size()-1;i++) {
			for(int j=0;j<obj_list.size()-i-1;j++) {
				if(obj_list.get(j).getEmployeeID()>obj_list.get(j+1).getEmployeeID()) {
					Employees temp=obj_list.get(j);
					obj_list.set(j,obj_list.get(j+1));
					obj_list.set(j+1,temp);
				}
			}
		}
		System.out.println(obj_list);
	}
	void sortDesc(){
		for(int i=0;i<obj_list.size()-1;i++) {
			for(int j=0;j<obj_list.size()-i-1;j++) {
				if(obj_list.get(j).getEmployeeID()<obj_list.get(j+1).getEmployeeID()) {
					Employees temp=obj_list.get(j);
					obj_list.set(j,obj_list.get(j+1));
					obj_list.set(j+1,temp);
				}
			}
		}
		System.out.println(obj_list);
	}
	public static void main(String args[])
	{
		Bankapplication obj1=new Bankapplication();
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
		 if(choice==1) {
			 String name=sc.next();
			 int empid=sc.nextInt();
			 obj1.create(empid,name);
		 }
		 if(choice==2) {
			 String name=sc.next();
			 int empid=sc.nextInt();
			 obj1.append(empid,name);
		 }
		 if(choice==3) {
			 int empid=sc.nextInt();
			 obj1.delete(empid);
		 }
		 if(choice==4) {
			 //employee id cannot be updated only changes in name can be done
			 String name=sc.next();
			 int empid=sc.nextInt();
			 obj1.update(empid,name);
		 }
		 if(choice==5) {
			 String name=sc.next();
			 obj1.searchbyname(name);
		 }
		 if(choice==6) {
			 obj1.sortAsc();
		 }
		 if(choice==7) {
			 obj1.sortDesc();
		 }
		 if(choice==8)
		 {
			 System.err.println("Qutting the application..");
			 break;
		 }
		 
		 }
		
	}

}
