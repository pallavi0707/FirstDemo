package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;            ///contain collection,list and Deque methodes in Linkedlist
import java.util.Scanner;

public class ExampleLinkedlist {
public static void main(String[] args) {
	//H1();

}

static void H1() {
      LinkedList ll=new LinkedList();
       ll.add("shivam");
       ll.add(10);
       ll.add(20.5f);
       ll.add('x');
       ll.add(20); 
       System.out.println("linkedlist=="+ll);

      ll.addFirst("pallavi");                     //first la object add krto
      System.out.println("linkedlist=="+ll);
      ll.addLast("phule");                         //last la object add krto
      System.out.println("linkedlist=="+ll);
      ll.removeFirst();                             //first object remove karel
      System.out.println("linkedlist=="+ll);
      ll.remove(2);
      System.out.println("linkedlist=="+ll);
      System.out.println(ll.getFirst());
      System.out.println(ll.getLast());
}




}
