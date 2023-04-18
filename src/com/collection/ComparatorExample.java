package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
 public static void main(String[] args) {
	    
	 
	 Comparator<Students> com=new Comparator<Students>() {

		@Override
		public int compare(Students o1, Students o2) {
			if(o1.sAge>o2.sAge)
			return 1;
			else
				return -1;
		}
		 
		 
		 
	 
	};
	 
	 
	/* List<Students> slist=new ArrayList<>();
	 
	 Students s1=new Students(21, "navin");
	 Students s2=new Students(12, "john");
	 Students s3=new Students(18, "parul");
	 Students s4=new Students(20, "kiran");
	 
	 slist.add(s1);
	 slist.add(s2);
	 slist.add(s3);
	 slist.add(s4);
	 System.out.println(slist);
	 Collections.sort(slist,com);
	 System.out.println(slist);*/
	
}
class Students implements Comparator<Students>{
	
	int sAge;
	String sName;
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "Students [sAge=" + sAge + ", sName=" + sName + "]";
	}
	public Students(int sAge, String sName) {
		super();
		this.sAge = sAge;
		this.sName = sName;
	}
	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Students() {
		
	}
	
}
}
	

