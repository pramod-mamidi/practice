package com.bajaj.helloworld;
import java.util.*;
public class map {
	public static void main(String args[]) {
		Map<String,Integer> hm=new HashMap<String,Integer>();
		Map<String,Integer> lhm=new LinkedHashMap<String,Integer>();
		Map<String,Integer> tm=new TreeMap<String,Integer>();
		Map<String,Integer> ht=new Hashtable<String,Integer>();
		
		hm.put("pramod",12);
		lhm.put("pramod",12);
		tm.put("pramod",12);
		ht.put("pramod",12);
		
		hm.put("pra",17);
		lhm.put("pra",17);
		tm.put("pra",17);
		ht.put("pra",17);
		
		hm.put("mod",13);
		lhm.put("mod",13);
		tm.put("mod",13);
		ht.put("mod",13);
		
		for(String i:hm.keySet()) {
			System.out.println(i);
			System.out.println(hm.get(i));
		}
		
		for(String i:tm.keySet()) {
			System.out.println(i);
			System.out.println(hm.get(i));
		}
	}
}
