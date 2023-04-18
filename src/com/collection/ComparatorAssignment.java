package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ComparatorAssignment {
	static int responce;
	
public static void main(String[] args) {
	      
	Adress add1=new Adress(41, "Pune", "Mulshi");
	Adress add2=new Adress(42, "Pune", "Shirur");
	Adress add3=new Adress(43, "solapur", "Malshirus");

	
	List<Adress> addreslist=new ArrayList<>();
	
	addreslist.add(add1);
	addreslist.add(add2);
	addreslist.add(add3);
	System.out.println("before sort");
	System.out.println( addreslist);
	
	System.out.println("after sort");
	Collections.sort(addreslist,new Adress());
	System.out.println( addreslist);  
	
	System.out.println(" sort by district");
	Collections.sort(addreslist,new SortBydistrict());
	System.out.println( addreslist);
	
	System.out.println(" sort by taluka");
	Collections.sort(addreslist,new SortBytaluka ());
	System.out.println( addreslist);
	
	
Comparator<Adress> addressComparator = new Comparator<Adress>() {
	    @Override
	    public int compare(Adress address1, Adress address2) {
	 // Compare the district property of the two Address objects
	        int districtComparison = address1.getDistrict().compareTo(address2.getDistrict());
	        if (districtComparison != 0) {
	            // If the district names are different, return the comparison result
	            return districtComparison;
	        } else {
	            // If the district names are the same, compare the pincode property in descending order
	            return Integer.compare(address2.getPincode(), address1.getPincode());
	        }
	    }
	};
	
	System.out.println("after sort");
	Collections.sort(addreslist, addressComparator);
System.out.println(addreslist);

	
	/*Comparator<Adress> addressComparator = new Comparator<Adress>() {
	    @Override
	    public int compare(Adress address1, Adress address2) {
	
	        int responce = address1.getDistrict().compareTo(address2.getDistrict());
	        if (responce== 0) {
	        	
	            return responce;
	        } else {
	            
	            return Integer.compare(address2.getPincode(), address1.getPincode());
	        }
	    }
	};*/
	
	
	
}


}

class Adress implements Comparator<Adress>{
	int pincode;
	String district;
	String taluka;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	@Override
	public String toString() {
		return "Adress [pincode=" + pincode + ", district=" + district + ", taluka=" + taluka + "]";
	}
	public Adress(int pincode, String district, String taluka) {
		super();
		this.pincode = pincode;
		this.district = district;
		this.taluka = taluka;
	}
	@Override
	public int compare(Adress o1, Adress o2) {
		// TODO Auto-generated method stub
		return - (o1.getPincode()-o2.getPincode());
	}
	
	public Adress() {
		
	}
	
}
class SortBydistrict implements Comparator<Adress>{

	@Override
	public int compare(Adress o1, Adress o2) {
		return  (o1.getDistrict().compareTo(o2.getDistrict()));
		
			
		
	}
	
}
class SortBytaluka implements Comparator<Adress>{

	@Override
	public int compare(Adress o1, Adress o2) {
	
		return (o1.getTaluka().compareTo(o2.getTaluka()));
	}

}

