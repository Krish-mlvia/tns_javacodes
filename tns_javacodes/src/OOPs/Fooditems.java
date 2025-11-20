package OOPs;

public class Fooditems {
	//variables
		String name;
		double price;
		String category;
		
		//methods
		
		void displayDetails()
		{
			System.out.println("Food Name :"+name);
			System.out.println("Price :"+price);
			System.out.println("Category : "+category);
			System.out.println("----------------");
			
		}

	public static void main(String[] args) {
        Fooditems fooditems=new Fooditems();
		
		fooditems.name="veg burger";
		fooditems.price=199.3;
		fooditems.category="Fast food";
		fooditems.displayDetails();
		
		Fooditems fooditems1=new Fooditems();
		fooditems1.name="Paneer Pizza";
		fooditems1.price=299.9;
		fooditems1.category="italian";
		
		fooditems1.displayDetails();

	}

}
