package com.bajaj.helloworld;
import java.util.*;
interface ltou{
	public void toupper(String s);
}
interface eoo{
	public void evenorodd(int n);
}
interface pon{
	public void posorneg(int n);
}

public class lambda_practice {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		ltou ex1=(str)->{ System.out.println(str.toUpperCase()); };
		eoo ex2=(num)-> {
			if(num%2==0)
			{
				System.out.println("even");
			}
			else 
			{
				System.out.println("odd");
			}
		};
		pon ex3=(num)->{
			if(num>0) {
				System.out.println("positive");
			}
			else if(num<0) {
				System.out.println("negative");
			}
			else {
				System.out.println("neither");
			}
		};
		
		ex1.toupper(s);
		ex2.evenorodd(n);
		ex3.posorneg(n);
	}
}
