package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Assignment1 {
public static void main(String[] args) {
	//B1();
	//B2();
	B4();
	//H4();
	//B5();
	//B3();
	//H2();
}
static void B1() {
	List<Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(20);
	l.add(45);
	l.add(55);
	l.add(40);
	System.out.println(l);
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
		
	}
		Collections.reverse(l);
		System.out.println(l);
		
	ListIterator<Integer>	listitr=l.listIterator();
	while(listitr.hasNext()) {
		System.out.println(listitr.next());
		
		
	}
	
	//System.out.println("reverse="+l.);
	
	/*.forEach(x->System.out.println(x));
	Collections.reverse(l);
	
	System.out.println(l)*/
}
static void B4() {
	List<Integer> l4=new ArrayList<Integer>();
	l4.add(20);
	l4.add(50);
	l4.add(30);
	l4.add(40);
	System.out.println(l4);
	
	System.out.println("----using forward----------");
	int i=0;
	while(i<l4.size()) {
		
		System.out.println(l4.get(i));
		i++;
		
	}
	
	System.out.println("----backward direction----");
	int j=l4.size()-1;
	
	while(j>=0) {
		
		System.out.println(l4.get(j));
		j--;
		
	}
	
	
	
	
	
}



static void H4() {
	List<Integer> l7=new ArrayList<Integer>();
	l7.add(20);
	l7.add(50);
	l7.add(30);
	l7.add(40);
	System.out.println(l7);
	
	
	int i=0;
	do {
		i++;
	}while(i<l7.size());
		
	System.out.println(l7);
	Collections.reverse(l7);
	System.out.println("reverse="+l7);
}

static void B5() {
	Scanner sc =new Scanner(System.in);
	List<Integer> l4=new ArrayList<Integer>();
	System.out.println("Enter ur Elements");
	int Elements=sc.nextInt();
	int i=0;
	boolean condition=true;
	while(condition) {
		if(l4.isEmpty()) {
			l4.add(sc.nextInt( Elements));
			
			
		}else {
			
			
		}
		i++;
		System.out.println(l4);
		
	}
	
}

 static void B2() {
	List<Integer> l1=new ArrayList<Integer>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ur Element");
	int Element=sc.nextInt();
	int i=0;
	while(l1.isEmpty()) {
	l1.add(sc.nextInt(Element));
	l1.add(sc.nextInt(Element));
	l1.add(sc.nextInt(Element));
	l1.add(sc.nextInt(Element));
	l1.add(sc.nextInt(Element));
	i++;
	System.out.println(l1);
	}
	Collections.reverse(l1);
	System.out.println(l1);
	
 }
 
 static void B3() {
	 
		 List<Integer> l2=new ArrayList<Integer>();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter ur Element");
			int num=sc.nextInt();
			int i=0;
			while(i<= num) {
				l2.add(sc.nextInt(i));
				i++;
				
			}
		 System.out.println("forwaed="+l2);
		 Collections.reverse(l2);
		 System.out.println("reverse="+l2);
		 
		 
	
 }
 /*static void H2() {
     List<Integer> al=new ArrayList<>();
     Scanner sc=new Scanner(System.in);
	   System.out.println("enter ur element");
	   int element=sc.nextInt();
     boolean condition=true;
     while(condition) {
  	 
  	   al.add(element);
  	  
  	   
  	   
     }
     System.out.println(al);


}*/


}
