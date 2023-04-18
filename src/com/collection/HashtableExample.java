package com.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashtableExample {
     public static void main(String[] args) {
		
    	                                                      //hashtable initial capacity is 11
    	 
    	 Hashtable<Integer, String> ht=new Hashtable<>();          //keys cannot be duplicated but values we can use duplicate
    	 ht.put(101, "pallavi");                                   //INSERTION ORDER NOT FOLLOW
    	 ht.put(102, "trisha");
    	 ht.put(103, "shivam");
    	/// ht.put(null, "pp");
    	// ht.put(104, null);                  //as key or value Null cannot be allowed in hashtable-it gives null pointer exception
    	 System.out.println(ht);
    	 
    	 System.out.println(ht.get(102));
    	 System.out.println(ht.remove(103));
    	 System.out.println(ht);
    	 System.out.println(ht.containsKey(101));
    	 System.out.println(ht.containsKey(105));
    	 System.out.println(ht.containsValue("pallavi"));
    	 
    	 System.out.println(ht.containsValue("xx"));
    	 
    	 System.out.println(ht.isEmpty());
    	 System.out.println(ht.keySet());               //return only keys
    	 System.out.println(ht.values());
    	 
    	 //indiviual key and values
    	 for(int i:ht.keySet()) {
    		 System.out.println(i+"  "+ht.get(i));
    	 }
    	 
 
    	 
  
	}
}
