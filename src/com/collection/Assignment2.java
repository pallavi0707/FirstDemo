package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment2 {
public static void main(String[] args) {
	//V1();
	//V2();
	V3();
}

static void V1() {
	
	List <Integer> l1=new ArrayList<Integer>();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	boolean flag=false;
	do {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur element");
		int element=sc.nextInt();
		if(l1.contains(element)) {
			System.out.println("this element already present,do u want to add again");
			String msg=sc.next();
			if(msg.equalsIgnoreCase("y")) {
				l1.add(element);
				
			}else {
				l1.add(element);
				
			}
			System.out.println(" do u want to contineu");
			String msg1=sc.next();
			if(msg1.equalsIgnoreCase("y")) {
				flag=true;
				
			}else {
				flag=false;
				
			}
			
			
		}
		
		
	}while(flag);
	System.out.println(l1);
}


static void V2() {
	List <Integer> l1=new ArrayList<Integer>();
	l1.add(50);
	l1.add(10);
	boolean condition=true;
		Scanner sc=new Scanner(System.in);
	System.out.println("enter ur element");
	int element=sc.nextInt();
	
	while(condition) {
		if(l1.contains(element)) {
			System.out.println("this element already present, do u want to add");
			String msg=sc.next();
			if(msg.equalsIgnoreCase("y")){
				l1.add(element);
				
			}else {
				l1.add(element);
			}
			
			
		}
		
		
			System.out.println(l1);
		
		
		
	}
	
	
	
	
}

static void V3() {                                       //try keley pn chukly
	
	List <Integer> l3=new ArrayList<Integer>();
	l3.add(50);
	l3.add(40);
	l3.add(30);
	
	do {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur element");
		int element=sc.nextInt();
		if(l3.contains(element)) {
			System.out.println("this element already present do u add");
			String msg=sc.next();
			if(msg.equalsIgnoreCase("y")) {
				l3.add(element);
				
			}else {
				l3.add(element);
				
			}
			
			System.out.println("this element not present do u add");
			String msg3=sc.next();
			if(msg3.equalsIgnoreCase("y")) {
				l3.add(element);
				
			}else {
				l3.add(element);
			}
			
			
		}
		
		
	}while(true);
	
	
	
	
	
	
	
}



}
