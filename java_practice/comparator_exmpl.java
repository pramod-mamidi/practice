package com.bajaj.helloworld;
import java.util.*;

class Cricket{
	int score;
	String name;
	int balls;
	
	Cricket(int s,int b,String n){
		this.score=s;
		this.name=n;
		this.balls=b;
	}
}
class comp_score implements Comparator<Cricket>{
	public int compare(Cricket c1,Cricket c2){
		if(c1.score>c2.score) {
			return 1;
		}
		else if(c2.score>c1.score){
			return -1;
		}
		else {
			return 0;
		}
	}
}

class comp_balls implements Comparator<Cricket>{
	public int compare(Cricket c1,Cricket c2){
		if(c1.balls>c2.balls) {
			return 1;
		}
		else if(c2.balls>c1.balls){
			return -1;
		}
		else {
			return 0;
		}
	}
}

public class comparator_exmpl {
	public static void main(String args[]) {
		Cricket c1=new Cricket(106,62,"kohli");
		Cricket c2=new Cricket(12,26,"sachin");
		Cricket c3=new Cricket(37,11,"dhoni");
		
		ArrayList<Cricket> al=new ArrayList<Cricket>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		
		comp_score obj=new comp_score();
		comp_balls obj1=new comp_balls();
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==0) {
			Collections.sort(al,obj);
		}
		else if(choice==1) {
			Collections.sort(al,obj1);
		}
		
		for(Cricket i: al) {
			System.out.println(i.name);
			System.out.println(i.score);
			System.out.println(i.balls);
		}
	}
}
