package com.bajaj.helloworld;
import java.util.*;
class Student{
	int age;
	String subject,name;
	double grade;
	Student(String name,int age,String subject,double grade){
		this.name=name;
		this.age=age;
		this.subject=subject;
		this.grade=grade;
	}
	protected String status(){
		if(grade>9) {
			return "Top grade";
		}
		if(grade>7.5) {
			return "Distinction";
		}
		else if(grade>6){
			return "First class";
		}
		else {
			return "Fail";
		}
	}
	void print() {
		System.out.println("Student details are");
		System.out.println(name);
		System.out.println(age);
		System.out.println(subject);
	}
}
class Scholarship extends Student{
	
}
public class Helloworld1 {
	private int a;
	int b;
	static String c="Oops";
	Helloworld1(int a,int b){
		this.a=a;
		this.b=b;
	}
	void printvalue() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String args[]) {
		Helloworld1 obj=new Helloworld1(10,20);
		obj.printvalue();
		Student obj1=new Student("pramod",20,"CSE",8.59);
		obj1.print();
	}
}
