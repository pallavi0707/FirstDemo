package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItrdemo {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add(25);
	l.add("pranali");
	System.out.println( l);
	
	System.out.println("--------------");
	
	ListIterator lisitr=l.listIterator();
	
	
	                               //starting la cursor top position la asto
	lisitr.next();              //move cursor using this also
	lisitr.next();  
	
	

	
    while(lisitr.hasNext()) {                           //forward direction element get
    	  System.out.println(lisitr.next());
      }
      
     
     System.out.println("----------------------");
      
      while(lisitr.hasPrevious()) {                            //backword direction element get
    	  System.out.println(lisitr.previous());
      }
      
      l.remove(0);                    //index potision pass kravi lagte list sati value pass keli tr exception throw krte
      System.out.println( l);
      
      l.add(225);
      System.out.println(l);
      
      
      l.set(0, 400);
      
      System.out.println(l);
} 

}
