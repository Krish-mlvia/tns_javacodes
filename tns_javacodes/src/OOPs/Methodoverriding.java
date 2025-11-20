package OOPs;

class Payment //parent class
{
	void makePayment()
	{
		System.out.println("Processing payment using generic method");
	}
}

class UpiPayment extends Payment //sub class
{
	void makePayment()
	{
		System.out.println("Payment made using UPI");
	}
}
class CardPayment extends Payment //sub class
{
	void makePayment()
	{
		System.out.println("Payment made using credit card");
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
Payment payment;
		
		payment= new UpiPayment();
		payment.makePayment();
		
		
		payment=new CardPayment();
		payment.makePayment();

	}

}
