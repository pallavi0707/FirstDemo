package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	static void demo() {
		college c1=new college(1, "AA");
		college c2=new college(1, "AA");
		college c3=new college(1, "BB");
		college c4=new college(1, "CC");
		Set<college> cset=new HashSet<>();
		cset.add(c1);
		cset.add(c2);
		cset.add(c3);
		cset.add(c4);
		System.out.println(cset);
		
		Map<college, String> hmaplist= new HashMap<>();
		String c1result=hmaplist.put(c1, "v1");
		System.out.println("c1result==="+c1result);
		String c2result=hmaplist.put(c2, "v2");
		System.out.println("c2result==="+c2result);
	}
	
	public static void main(String[] args) {
		demo();
	}
	
}
class college{
	int collegeId;
	String collegeName;
	@Override
	public String toString() {
		return "college [collegeId=" + collegeId + ", collegeName=" + collegeName + "]\n";
	}
	public college(int collegeId, String collegeName) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
	}
	
	
	
	
}