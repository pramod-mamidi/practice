
//take stream of random number and print even and odd upto to 100 number
package com.bajaj.helloworld;
import java.lang.*;
import java.util.*;
public class stream1 {
	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<=300;i++) {
			Random rand = new Random();
			int rd=rand.nextInt(200);
			al.add(rd);
		}
		al.stream().filter(num-> num<101).filter(num-> num%2==0).forEach(x->System.out.println("Even numbers are "+x));
		al.stream().filter(num-> num<101).filter(num-> num%2!=0).forEach(y->System.out.println("odd numbers are "+y));
	}
}
