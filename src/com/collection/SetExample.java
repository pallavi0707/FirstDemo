package com.collection;

import java.util.HashSet;
import java.util.Set;                    //set ----is not index based data sturure------it store data according to hashcode value
                                         //set does not follow insertion order
public class SetExample {                 //does not allow to strore duplicate element
	                                      //in set only one Null value allow---bcoz duplicate not allow
public static void main(String[] args) {
	
	Set s= new HashSet();
	s.add(102);
	s.add("pallavi");
	s.add(225);
	s.add(20.2d);
	
	s.add(102);                   //  duplicate not store
	
	s.add(null);                     //only one null store
	s.add(null);
	s.add(null);
	System.out.println(s);

}
}
