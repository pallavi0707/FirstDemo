package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignment {
  public static void main(String[] args) {
	M1();
}
  static void M1() {
	  List<Integer>al=new ArrayList<Integer>();
	  List<Integer>ll=new LinkedList<Integer>();
	  do {
		  Scanner sc= new Scanner(System.in);
	  System.out.println("1.ArrayList 2.LinkedLIst" );
	  System.out.println("Enter your choice");
	  int choice=sc.nextInt();
	  switch(choice) {
	  
	  case 1:{
		  System.out.println("How many elements add in ArrayList");
		  int size=sc.nextInt();
		  for(int i=1;i<=size;i++) {
			 al.add(sc.nextInt());  
		  }
		  System.out.println("ArrayList---->"+al);
	  }
	  System.out.println("do you want to addAll Arayylist element in LinkedList");
	  String msg=sc.next();
	  if(msg.equalsIgnoreCase("Y")) {
		  ll.addAll(al);
	  }else {
		  al.addAll(ll);
		  
	  }
	  
	  case 2:{
		  System.out.println("How many elements add in LinkedList");
		  int size=sc.nextInt();
		  for(int i=1;i<=size;i++) {
			 ll.add(sc.nextInt());
		  }
		  System.out.println("LinkedList--->"+ll);
	  }
	  System.out.println("do you want to addAll LinkedList element in ArrayList");
	  String msg1=sc.next();
	  if(msg1.equalsIgnoreCase("Y")) {
		  al.addAll(ll);
	  }else {
		  ll.addAll(al);
		  
	  }
	  System.out.println("--------------------------------");
	  System.out.println("ArrayList---->"+al);
	  System.out.println("LinkedList--->"+ll);
	  }
	 
	  break;
	  
  }while(true);
  }
  
  
  
  
}
