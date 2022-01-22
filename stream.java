package com.bajaj.helloworld;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;
class laptop implements Comparable<laptop>{
	String name,model,hdd,ssd;
	int ram,gpu;
	float cost;
	laptop(String name,String model,String hdd,String ssd,int ram,int gpu,float cost){
		this.name=name;
		this.model=model;
		this.hdd=hdd;
		this.ssd=ssd;
		this.ram=ram;
		this.gpu=gpu;
		this.cost=cost;
	}
	public int compareTo(laptop l1) {
		if(this.cost>l1.cost) {
			return 1;
		}
		else if(this.cost<l1.cost) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
public class stream {
	public static void main(String args[]) {
		ArrayList<laptop> al=new ArrayList<laptop>();
		al.add(new laptop("HP","pavilion","800mb","250mb",8,4,84330.34f));
		al.add(new laptop("DELL","latitude","1gb","250mb",12,8,101234.23f));
		al.add(new laptop("MACBOOK","pro","500mb","100mb",8,0,158764.23f));
		al.add(new laptop("ACER","predator","1gb","450mb",16,8,122567.12f));
		al.add(new laptop("ASUS","rog","750mb","300mb",8,4,73824.24f));
		al.add(new laptop("HP","notebook","750mb","300mb",12,4,113824.34f));
		al.add(new laptop("ACER","predator","850mb","250mb",16,12,133814.24f));
		
		//what is the cheapest laptop available
		System.out.println("cheapest laptop available");
		Optional<laptop> st=al.stream().min((i,j)->i.compareTo(j));
		System.out.println(st.get().name+st.get().model);
		//what is the costliest laptop available
		System.out.println("costliest laptop available");
		Optional<laptop> stma=al.stream().max((i,j)->i.compareTo(j));
		System.out.println(stma.get().name+stma.get().model);
		//count the no of laptops which have ram greater than 4gb
		System.out.println("no of laptops which have ram greater than 4gb");
		long i=al.stream().filter(lap->lap.ram>4).count();
		System.out.println(i);
		//count the no of laptops gpu less than 8gb
		System.out.println("no of laptops gpu less than 8gb");
		long j=al.stream().filter(lap->lap.gpu<8).count();
		System.out.println(j);
		//print all laptops which cost less than  1 lakh
		System.out.println("laptops which cost less than  1 lakh");
		List<laptop> ob=al.stream().filter(lap->lap.cost<100000f).collect(Collectors.toList());
		for(laptop l: ob) {
			System.out.println(l.name+l.model);
		}
		//print all laptops whose ram is greater than 8gb
		System.out.println("laptops whose ram is greater than 8gb");
		List<laptop> ob1=al.stream().filter(lap->lap.ram>8).collect(Collectors.toList());
		for(laptop l: ob1) {
			System.out.println(l.name+l.model);
		}
		//print all laptops whose hdd is 1gb
		System.out.println("laptops whose hdd is 1gb");
		List<laptop> ob2=al.stream().filter(lap->lap.hdd=="1gb").collect(Collectors.toList());
		for(laptop l: ob2) {
			System.out.println(l.name+l.model);
		}
		//print all the laptop names in sorted order according to cost(costliest to cheapest)
		System.out.println("sorted order according to cost");
		List<laptop> ob3=al.stream().sorted((lp1,lp2)->lp1.compareTo(lp2)).collect(Collectors.toList());
		for(laptop l: ob3) {
			System.out.println(l.name+l.model+l.cost);
		}
		//Apply a discount of 25 percent on laptops which cost more than 1lakh
		System.out.println("Applying discount");
		al.stream().filter(lap->lap.cost>100000f).map(lap->lap.cost=(float)(lap.cost-(lap.cost*0.25))).forEach(x->System.out.println(x));
		//print the 3 cheapest laptops
		System.out.println("Three cheapest laptops");
		List<laptop> ob6=al.stream().limit(3).sorted((lp1,lp2)->lp1.compareTo(lp2)).collect(Collectors.toList());
		for(laptop l: ob6) {
			System.out.println(l.name+l.model+l.cost);
		}
		//Print list of companies whose brands are available
		System.out.println("list of brands")
		al.stream().collect(Collectors.groupingBy(lap->lap.name)).values().forEach(x->System.out.println(x.get(0).name));
	}
}
