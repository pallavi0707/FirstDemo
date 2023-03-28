package com.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
public class CollectionDemo {
public static void main(String[] args) {
	

	ArrayList al=new ArrayList();
	System.out.println("----Add methode----for add object------");
	
	al.add(100);          //100 insrt as an object or element not int
	al.add("pallavi");
	al.add("phule");                 //all this is one collection object
	al.add(10.2f);
	System.out.println(al);
	
System.out.println(al.add(200));       //true or false value return---object add in collection object 
System.out.println(al);               //result display with adding value
	

System.out.println(al.contains(200));       //contain methode return true false-means in collection object 
                                              //whatever value we have pass that present in collction object or not if present then retun true otherwise false
System.out.println(al.contains(400));

System.out.println(al.indexOf("pallavi"));       ///return index of perticular element
	


System.out.println(al.isEmpty());          //isEmpty--- check arraylist is empty or not if it empty then it will return true otherwise false
	

System.out.println(al.size());         // size methode---     size of collection object means how many elements present in collection object
	





System.out.println(al.remove("phule"));         //if we want to remove perticular element through arraylist or collection then we use remove methode of ollection (I)

System.out.println(al);



System.out.println(al.remove(0));      //if we want to remove integer value then it will count as an index postion it will thorws exception only for int

System.out.println(al.remove(10.2f));
System.out.println(al);


/*	ArrayList al1=new ArrayList();
	al1.add(101);
	al1.add("payal");
	al1.add('c');
	System.out.println(al1);
	
	ArrayList al2=new ArrayList();
	al2.add(101);
	al2.add("prajwal");
	al2.add("priya");
	System.out.println(al2);
	
	al1.removeAll(al2);                   //removeall methode----remove commaon element between two collection object
	System.out.println(al1);
	System.out.println(al1);
	System.out.println(al2);
	
	
	al1.clear();                          //clear methode-----remove all the element in collection object
	System.out.println(al1);
	
	
	
	//Add one collection to another collection
	
	
	/*System.out.println("----Addall collection methode----");
	al.addAll(al1);             //add all element of al1 into al through add all collection methode
	System.out.println(al);*/
	

}
}
