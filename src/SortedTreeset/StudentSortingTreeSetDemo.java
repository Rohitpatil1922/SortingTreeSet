package SortedTreeset;

import java.util.TreeSet;

public class StudentSortingTreeSetDemo {
	 
	public static void main(String[] args) {
		 
		StudentRollComparator stdSortByRoll = new StudentRollComparator();
		StudentNameComparator stdSortByName = new StudentNameComparator();
		StudentCityComparator StdSortByCity = new StudentCityComparator();
		TreeSet<Student> treeSet1 = new TreeSet<Student>(stdSortByRoll);
		TreeSet<Student> treeSet2 = new TreeSet<Student>(stdSortByName);
		TreeSet<Student> treeSet3 = new TreeSet<Student>(StdSortByCity);
		
		Student s1 = new Student(10,"Prathmesh","Pune");
		Student s2 = new Student(20,"Samarjeet","Kolhapur");
        Student s3 = new Student(30,"Nilesh","Mumbai");
		Student s4 = new Student(50,"Pranav","Nashik");
		
		treeSet1.add(s1);
		treeSet1.add(s2);
		treeSet1.add(s3);
		treeSet1.add(s4);
		
		System.out.println("Sorted By Roll :" +treeSet1);
		
		treeSet2.add(s1);
		treeSet2.add(s2);
		treeSet2.add(s3);
		treeSet2.add(s4);

		System.out.println("Sorted By Name :" +treeSet2);
		
		treeSet3.add(s1);
		treeSet3.add(s2);
		treeSet3.add(s3);
		treeSet3.add(s4);
		
		System.out.println("Sorted By City :" +treeSet3);

		
		
	}

}
