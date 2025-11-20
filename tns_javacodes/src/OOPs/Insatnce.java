package OOPs;

class Person1
{
	
}
class Employee1 extends Person1
{
	
}
class Manager extends Employee1
{
	
}

public class Insatnce {

	public static void main(String[] args) {
		Person1 person=new Person1();
		Employee1 emp=new Employee1();
		Manager manager=new Manager();
		
		System.out.println(emp instanceof Employee1); //true
		System.out.println(emp instanceof Person1);//true
		System.out.println(emp instanceof Manager);//false
		System.out.println(manager instanceof Manager);//true
		System.out.println(manager instanceof Employee1);//true
		System.out.println(manager instanceof Person1);
		System.out.println(person instanceof Person1);
		System.out.println(person instanceof Employee1);
		System.out.println(person instanceof Manager);

	}

}
