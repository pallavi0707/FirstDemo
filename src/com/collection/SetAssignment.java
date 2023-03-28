package com.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetAssignment {
  public static void main(String[] args) {
	  
	  Stud s1=new  Stud(1, "aa", 20);
	  Stud s2=new  Stud(2, "bb", 22);
	  Stud s3=new  Stud(3, "cc", 25);
	  
	  Set<Stud> studset=new HashSet<Stud>();
	  studset.add(s1);
	  studset.add(s2);
	  studset.add(s3);
	  
	  System.out.println(studset);
	  
	  Stud s4=new  Stud(3, "cc", 25);
	  studset.add(s4);
	  
	  System.out.println(studset);
}
}


class Stud{
	
	
	int sId;
	String sName;
	int mark;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return "Stud [sId=" + sId + ", sName=" + sName + ", mark=" + mark + "]";
	}
	public Stud(int sId, String sName, int mark) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.mark = mark;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sId, sName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stud other = (Stud) obj;
		return sId == other.sId && Objects.equals(sName, other.sName);
	}
	
	
	
	
	
	
	
	
}
