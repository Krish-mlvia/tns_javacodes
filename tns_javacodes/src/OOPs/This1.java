package OOPs;

class Person
{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int getAge() {
		return age;
	}

	public void displayDetails() {
		System.out.println("name :"+name);
		System.out.println("age :"+age);
	}
}

public class This1 {

	public static void main(String[] args) {
		Person person=new Person();
		person.setName("Anil");
		person.setAge(12);
		person.displayDetails();
		person.setName("Sushma");
		person.setAge(45);
		person.getName();
		person.getAge();
		person.displayDetails();

	}

}
