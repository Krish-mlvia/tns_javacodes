package OOPs;

class Employee
{
	void company()
	{
		System.out.println("Company : TNSIF");
	}
}

class Developer extends Employee
{
	void role()
	{
		System.out.println("Role : Software Developer");
	}
}
class Tester extends Employee
{
	void role()
	{
		System.out.println("Role : QA Tester");
	}
}

public class Heirachical {

	public static void main(String[] args) {
		Developer dev=new Developer();
		Tester test=new Tester();
		
		dev.company();
		dev.role();
		
		test.company();
		test.role();


	}

}
