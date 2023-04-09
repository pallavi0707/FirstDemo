package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
                                                         // treeset   //duplicate are not alloewd
                                                        //null accept only one time
public class TreesetDemo {                               //treset internaly workd as balanced trees-jo first element asto to root node asto -
	                                                     //second element add hotana tyach comparision hot root node shi greater ase 
	
     public static void main(String[] args) {
    	 comparabledemo();
    	
		ArrayList list=new ArrayList();
		list.add(10);
		list.add("shivam");
		System.out.println(list);
		
		
		
		TreeSet tset=new TreeSet();           //store data only homogenious and comparable type
		//tset.add("null");           //empty treeset asel tr first null add hoto pn empty nsel ani null add krt ase tr NULL pointer exception yet

	tset.add(20);                         //elemend add in by default natural sorting order-means assending order mdhe
		tset.add(10);
		tset.add(40);
		tset.add(30);
		tset.add("abc");  // hetrogenous data store hot nahi exception yety class cast exception */
		
		System.out.println(tset);
		
		
		/*TreeSet<Emp1> empset=new TreeSet<>();
		Emp1 e1=new Emp1(2, "pallavi");
		Emp1 e2=new Emp1(1, "shivam");
		Emp1 e3=new Emp1(3, "priya");
		
		empset.add(e1);
		empset.add(e2);
		empset.add(e3);
		
		System.out.println(empset);*/
		
       
	}
   static  void comparabledemo() {
    	 
    	 Studens s1=new Studens(1, "abc", 20);
    	 Studens s2=new Studens(2, "abc1", 30);
    	 Studens s3=new Studens(3, "abc2", 40);
    	 Studens s4=new Studens(4, "abc3", 50);
    	 
    	 List<Studens> studlist=new ArrayList<>();
    	 studlist.add(s1);
    	 studlist.add(s2);
    	 studlist.add(s3);
    	 studlist.add(s4);
    	 
    	 System.out.println("before sort==="+studlist);
    	 Collections.sort(studlist);
    	 
    	 System.out.println("after sort==="+studlist);
     }
     
     
     
     
}
class Emp1{
	int empId;
	String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + "]";
	}
	public Emp1(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	
	
	
	
}
class Studens implements Comparable<Studens>{
	int studentId;
	String studentName;
	int mark;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Studens(int studentId, String studentName, int mark) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.mark = mark;
	}
	@Override
	public int compareTo(Studens o) {
		// TODO Auto-generated method stub
		return - (this.getStudentId()-o.getStudentId()); //- sign use kel tr condition id chya decending madhe sort hot
		                                                  // - sign nahi use kel tr as it is print hot  //ha formula int /float double
		
	//	return (this.getStudentName().compareTo(o.studentName));         //ha formula string type ch object compare sort sati
		
	}                                                            
	
	@Override
	public String toString() {
		return "Studens [studentId=" + studentId + ", studentName=" + studentName + ", mark=" + mark + "]";
	}
	
	
	
}
