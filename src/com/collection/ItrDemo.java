package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItrDemo {
 public static void main(String[] args) {
	
	 List l=new ArrayList();
	 l.add(20);
	 l.add("pallavi");
	 l.add(20.5f);
	 System.out.println(l);
	 System.out.println("------------------------------------------");
	 
	Iterator itr =l.iterator();
	while(itr.hasNext()) {                 //hasnext methode is a methode of iterator interface---- hasnext boolean value return
		System.out.println(itr.next());      //one by one get elements
	}
}
}
