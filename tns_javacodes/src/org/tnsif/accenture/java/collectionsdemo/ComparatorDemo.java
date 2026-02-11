package org.tnsif.accenture.java.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person7
{
	String name;
	int age;
	
	public Person7(String name, int age) {
		
		this.name = name;
		this.age = age;
	}	
	void displayinfo()
	{
		System.out.println("Name : "+ name  + " Age :"+ age);
	}
}
//sort by name
class NameComparator implements Comparator<Person7>
{

	@Override
	public int compare(Person7 p1, Person7 p2) {
	
		return p1.name.compareTo(p2.name);
	}
	
}

//sort by age
class AgeComparator implements Comparator<Person7>
{

	@Override
	public int compare(Person7 p1, Person7 p2)
	{
		return Integer.compare(p1.age,p2.age);
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		List<Person7> people=new ArrayList<>();
		 people.add(new Person7("john",10));
		 people.add(new Person7("akash",26));
		 people.add(new Person7("vikas",40));
		 
		 Collections.sort(people , new NameComparator());
		 System.out.println("Sort by name");
		 for(Person7 person:people)
		 {
			 person.displayinfo();
		 }
		 
		 Collections.sort(people , new AgeComparator());
		 System.out.println("Sort by age");
		 for(Person7 person:people)
		 {
			 person.displayinfo();
		 }

	}

}
