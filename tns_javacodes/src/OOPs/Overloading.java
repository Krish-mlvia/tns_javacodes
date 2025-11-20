package OOPs;
class Calculator
{
	int add(int a,int b)
	{
		return a+b;
	}
	
	double add(double a , double b)
	{
		return a+b;
	}
	int add(int a, int b ,int c)
	{
		return a+b+c;
	}
}

public class Overloading {

	public static void main(String[] args) {
		Calculator obj=new  Calculator();
		 System.out.println("add(int,int) ->"+ obj.add(2, 20));
		 System.out.println("add(int,int,int) ->"+obj.add(3, 4,6));
		 System.out.println("add(double ,double) ->"+obj.add(1.2,3.5));


	}

}
