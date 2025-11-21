package OOPs;

class Student1
{
	String name;
	int age;
	
	Student1()
	{
		System.out.println("Default constructor");
	}
	Student1(String name)
	{
		this.name=name;
		System.out.println("Name :"+name);
	}
	Student1(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name :"+name + ",Age : "+age);
	}
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
        Student1 s1=new Student1();
		
		Student1 s2=new Student1("krish");
		
		Student1 s3=new Student1("samaira",19);

	}

}
