package tns_javacodes.demo;

public class Variable {
	int cost=10;//instance variable
	
	void print()
	{
		String msg="Hello";//local variable
		System.out.println(msg);
	}
static String message="Hello krish ";//static variable

	public static void main(String[] args) {
		Variable obj=new Variable();
		System.out.println(obj.cost);
		obj.print();
		System.out.println(message);

	}

}
