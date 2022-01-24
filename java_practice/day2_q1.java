package com.bajaj.helloworld;
class University{
	protected String name;
	int nirf_rank,students;
	University(String name,int students,int rank){
		this.name=name;
		this.nirf_rank=rank;
		this.students=students;
	}
	void print() {
		System.out.println("The name of the university is"+name+"no of students are"+students+"its nirf rank is"+nirf_rank);
	}
}
class pramod extends University{
	String name,reg_no;
	float grade;
	pramod(University obj,String n,String rn,float g){
		super(obj.name,obj.students,obj.nirf_rank);
		this.name=n;
		this.reg_no=rn;
		this.grade=g;
	}
	void print_stu() {
		System.out.println("The grade achieved by"+name+"reg_no"+reg_no+"is"+grade);
	}
}
public class day2_q1 {
	public static void main(String args[]) {
		University obj=new University("VIT",28000,17);
		pramod obj1=new pramod(obj,"pramod","18BCE0339",8.59f);
		obj1.print();
		obj1.print_stu();
	}
}
