package com.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetExample1 {
   public static void main(String[] args) {
	
	   Set<Emp> empset=new HashSet<Emp>();
	   Emp e1=new Emp(1,"shivam",10000);
	   Emp e2=new Emp(1,"shivam",20000);
	   Emp e3=new Emp(2,"aa",30000);
	   Emp e4=new Emp(3,"bb",40000);
	   
	   System.out.println("hashcode==e1  "+e1.hashCode());
	   System.out.println("hashcode==e2  "+e2.hashCode());
	   System.out.println("hashcode==e3  "+e3.hashCode());
	   System.out.println("hashcode==e4  "+e4.hashCode());
	   
	   empset.add(e1);
	   empset.add(e2);
	   empset.add(e3);
	   empset.add(e4);
	   
	   System.out.println("employeeset====="  +empset);
	   
	   
	   
}
}

class Emp{
	int empId;
	String empName;
	double empSalary;
	
	
	public Emp(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}


	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empSalary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return empId == other.empId && Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(empSalary) == Double.doubleToLongBits(other.empSalary);
	}




	
	
	
	
}
