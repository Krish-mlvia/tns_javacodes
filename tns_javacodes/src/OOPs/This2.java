package OOPs;
class Product{
	
	double price;
	
	Product(double price)
	{
		this.price=price;
	}
	double calculateDiscount()
	{
		return this.price*0.10; //apply 10% discount
	}
	double calcualteFinalPrice()
	{
		return this.price-this.calculateDiscount();
	}
}

public class This2 {

	public static void main(String[] args) {
		Product obj=new Product(400);
		System.out.println("Final Price "+obj. calcualteFinalPrice());


	}

}
