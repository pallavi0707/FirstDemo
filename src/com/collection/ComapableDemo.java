package com.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ComapableDemo {
         public static void main(String[] args) {
       
        	 Empp e1=new Empp(1, "Abc");
        	 Empp e2=new Empp(1, "Abc1");
        	 Empp e3=new Empp(2, "Abc2");
        	 Empp e4=new Empp(3, "Abc3");
        	 HashSet<Empp> emplist=new HashSet<>();
        	 emplist.add(e1);
        	 emplist.add(e2);
        	 emplist.add(e3);
        	 emplist.add(e4);
        	 System.out.println(emplist);
        	 
        	 TreeSet<Empp > trelist=new TreeSet<>();
        	 trelist.add(e1);
        	 trelist.add(e2);
        	 trelist.add(e3);
        	 trelist.add(e4);
       
        	 System.out.println(trelist);
}
}
class Empp implements Comparable<Empp>{
	int eId;
	String eName;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", eName=" + eName + "]";
	}
	public Empp(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}
	@Override
	public int compareTo(Empp o) {
		// TODO Auto-generated method stub
		return- (this.geteName().compareTo(geteName()));
	}
	public Empp() {
		
	}
	
}
