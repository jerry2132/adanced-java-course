package coreJavaComaprable;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Student> k = new ArrayList<>();
Student j = new Student(5,"sumit",21);
Student j1 = new Student(3,"spider",22);
Student j2 = new Student(1,"harry",30);
Student j3 = new Student(4,"peter ",33 );

k.add(j);
k.add(j1);
k.add(j2);
k.add(j3);
k.add(j1);  

System.out.println("arraylist is  "+ k);
//System.out.println(getName());
Collections.sort(k);
System.out.println();
System.out.println("sorted according to roll number ");
k.forEach(st -> System.out.println(st.getRollno()+"   "+st.getName()));
	 
System.out.println();
Collections.sort(k,new AgeComparator());
	System.out.println("age sorted  ");
//	System.out.println();
	k.forEach(student -> System.out.println(student.getName()));
	}

}
