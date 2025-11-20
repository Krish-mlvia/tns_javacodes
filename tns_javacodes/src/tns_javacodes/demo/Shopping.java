package tns_javacodes.demo;

public class Shopping {

	public static void main(String[] args) {
		int quantity=3;
		double priceitem=99.50;
		double totalprice = quantity*priceitem;
		
		//narrowing (manual) from double to int
		
		double discount=10.75;
		int roundedDiscount=(int)discount;
		double finalAmount =totalprice -roundedDiscount;
		
		System.out.println("Online Shopping summary");
		System.out.println("final amount "+finalAmount);

	}

}
