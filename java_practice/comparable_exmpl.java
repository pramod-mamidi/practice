package com.bajaj.helloworld;
import java.util.*;
class Employee implements Comparable<Employee>{
	String name;
	String id;
	int age;
	Employee(String name,String id,int age){
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
	public int compareTo(Employee e2) {
		if(this.age>e2.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class comparable_exmpl {
	public static void main(String args[]) {
		Employee e1=new Employee("pramod","1D3",18);
		Employee e2=new Employee("mohan","1D4",16);
		Employee e3=new Employee("harish","2D3",21);
		Employee e4=new Employee("yogesh","2D6",19);
		
		ArrayList<Employee> obj_list=new ArrayList<Employee>();
		obj_list.add(e4);
		obj_list.add(e3);
		obj_list.add(e2);
		obj_list.add(e1);
		
		Set<Employee> obj_set=new TreeSet<Employee>();
		obj_set.add(e4);
		obj_set.add(e3);
		obj_set.add(e2);
		obj_set.add(e1);
		
		Collections.sort(obj_list);
		
		for(Employee i: obj_list) {
			System.out.println(i.name);
			System.out.println(i.age);
			System.out.println(i.id);
		}
		for(Employee i: obj_set) {
			System.out.println(i.name);
			System.out.println(i.age);
			System.out.println(i.id);
		}
	}
}
