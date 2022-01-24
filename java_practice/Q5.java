package com.bajaj.helloworld;
public class Q5 {
	static boolean check(int a) {
		if(a%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String args[]) {
		int a=6;
		boolean res=check(a);
		System.out.println(res);
	}

}
