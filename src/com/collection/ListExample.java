package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;            //element add in index based position in list  ----becoz list is Index based data structure
                                   //list follow insertion order---means it disply record according to add sequence
public class ListExample {         //in list we can store duplicate value
	                               // in list multiple NULL value we can store
   public static void main(String[] args) {
	
	   List l=new ArrayList();
	  l.add(10);                //0 index position
	  l.add(12);                //1 index position
	  l.add(2,25);                //2 index position
	  l.add("pallavi");
	  
	 l.add(12);                  ///duplicate add
	 
	 l.add(null);                 //multiple null value store
	 l.add(null);
	 System.out.println(l);
	 
	 
	 
	Iterator itr= l.iterator();                 //iterator interface through get one by one element in list
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	  
	
}
   
   
   
   
   
   
}
