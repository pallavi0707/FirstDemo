package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Example {
	
	static void M1(){
		List<Integer> l=new ArrayList<Integer>();
		l.add(20);
		l.add(10);
		l.add(45);
		System.out.println(l);
		
		System.out.println(l.contains(20));
		System.out.println(l.add(50));
		System.out.println(l);
		System.out.println(l.isEmpty());
	    System.out.println(l.remove(1));
	    System.out.println(l);
	    System.out.println(l.size());
	    System.out.println(l.get(1));
	    System.out.println(l);
	   /* for(int i=0;i<=l.size();i++) {
			System.out.println(l.get(1));
		}*/
	    
	    List<Integer> l2=new LinkedList<Integer>();
		l2.add(41);
		l2.add(55);
		l2.add(20);
		System.out.println(l2);

		l.addAll(l2);
		System.out.println(l);
		System.out.println(l2.set(0, null));
	 l.removeAll(l2);
	 System.out.println(l);
		l2.clear();
		System.out.println(l2);
		System.out.println(l);
		
		
		
	}
       static void M2() {
           List l1=new ArrayList();
	          l1.add("abc");
	          l1.add(20);
	
	System.out.println(l1);
	System.out.println(l1.add('x'));
	System.out.println(l1);
	System.out.println(l1.contains("xyz"));
	System.out.println(l1.get(0));
	System.out.println(l1.isEmpty());
	System.out.println(l1.size());
	l1.clear();
	System.out.println(l1);
}
	
public static void main(String[] args) {
        M1();
	
	//System.out.println("-----without Generic------------");
	
	//M2();
	
}
 /*static void N1() {
	 Scanner sc=new Scanner(System.in);
	 List <Integer>l3=new ArrayList<Integer>();
	 System.out.println("enter ur element");
	 int element=sc.nextInt();
	 
	/* int i=0;
	 while(i<=l3.add(sc.nextInt())) {
		 l3.add(element);
	 }
 }*/





}
