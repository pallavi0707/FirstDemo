package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Asignment3 {
public static void main(String[] args) {
	//N1();
	N2();
	//N3();
}

    static void N1() {
    	
    	List<Integer> l1=new ArrayList<Integer>();
    	l1.add(10);
    	l1.add(20);
    	l1.add(30);
    	l1.add(40);
    	l1.add(50);
    	System.out.println(l1);
    	System.out.println("----using while----");
    	System.out.println("--- forwad direction---");
    	int i=0;
    	while(i<l1.size()) {
    		System.out.println(l1.get(i));
    		i++;
    		
    	}
    	
    	System.out.println("----backward diretion---");
    	
    	int j=l1.size()-1;
    	while(j>=0) {
    		System.out.println(l1.get(j));
    		j--;
    	}
   
    	System.out.println("----using Dowhile----");
    	
    	System.out.println("--- forward direction-----");
    	
    	int i1=0;
    	do {
    		System.out.println(l1.get(i1));
    		i1++;
    		
    	}while(i1<l1.size());
    	
    	
    	System.out.println("--backward direction---");
    	
    	int j1=l1.size()-1;
    	do {
    		System.out.println(l1.get(j1));
    		j1--;
    		
    	}while(j1>=0);
	
}

    static void N2() {
    	List<String> l2=new LinkedList<String>();
    	l2.add("Trisha");
    	l2.add("shivam");
    	l2.add("prajwal");
    	l2.add("kavya");
    	l2.add("priya");
    	System.out.println(l2);
    	
    	
    	System.out.println("---using while---");
    	System.out.println("---forward direction---");
    	int i=0;
    	while(i<l2.size()) {
    		System.out.println(l2.get(i));
    		i++;
    		
    	}
    	
    	System.out.println("---backward direction---");
    	int j=l2.size()-1;
    	while(j>=0) {
    		System.out.println(l2.get(j));
    		j--;
    		
    	}
    	
    	System.out.println("---using Dowhile---");
    	System.out.println("---forward direction---");
    	
    	int i1=0;
    	do {
    		System.out.println(l2.get(i1));
    		i1++;
    		
    	}while(i1<l2.size());
    	
    	
    	System.out.println("---backward direction---");
    	 int j1=l2.size()-1;
    	 do {
    		 System.out.println(l2.get(j1));
    		 j1--;
    		 
    	 }while(j1>=0);
    	
    	
    }
    
    
    static void N3() {
    	List<Integer> l3=new LinkedList<Integer>();
    	l3.add(10);
    	l3.add(20);
    	l3.add(30);
    	System.out.println("----using while----");
    	System.out.println("--- forwad direction---");
    	int i=0;
    	while(i<l3.size()) {
    		System.out.println(l3.get(i));
    		i++;
    		
    	}
    	
    	System.out.println("----backward diretion---");
    	
    	int j=l3.size()-1;
    	while(j>=0) {
    		System.out.println(l3.get(j));
    		j--;
    	}
    	int i1=0;
    	do {
    		System.out.println(l3.get(i1));
    		i1++;
    		
    	}while(i1<l3.size());
    	
    	
    	System.out.println("--backward direction---");
    	
    	int j1=l3.size()-1;
    	do {
    		System.out.println(l3.get(j1));
    		j1--;
    		
    	}while(j1>=0);
	
    	
    }






}
