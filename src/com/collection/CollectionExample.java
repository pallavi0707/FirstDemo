package com.collection;

import java.util.ArrayList;           
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionExample {
  public static void main(String[] args) {                
	                                                //OBJECT WITHOUT GENERIC REFERANCE
	ArrayList al=new ArrayList();                  //object of arraylist (arraylist is implemented class of List)
	al.add(10);                             
	al.add("pallavi");                                   //THIS ALL ARE OBJECT VALUES AND THIS ALL ARE CALLED AS COLLECTION OBJECT
	al.add('c');
	
	
	HashSet hs=new HashSet();           //object of HashSet(hasset is implemented class of Set)
	hs.add(10);
	hs.add("payal");                            //THIS ALL ARE OBJECT VALUES AND THIS ALL ARE CALLED AS COLLECTION OBJECT
	hs.add("phule");
	hs.add("true");
	System.out.println( hs);
	
	
	
	/*List l= new ArrayList();                //List refarance through we can create object of Arraylist and  LinkedList
	                                        //also we can create object of vector and stack
	List l1=new LinkedList();
	
	
	Set s=new HashSet();                  //Set refrance through we can create object of Hashset and linkedhashset and treeset
	Set s1=new LinkedHashSet();*/
	
	
}
  
  
}
