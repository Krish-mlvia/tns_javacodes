package OOPs;

class Payment1
{
	void process()
	{
		System.out.println("Processing payment using standard gateway");
	}
}
class GPay extends Payment1
{
	void process()
	{
		System.out.println("Processing payment via google pay ");
	}
	
	void completeTransaction()
	{
		process();
		super.process();
	}
}
public class Superwithmethod {

	public static void main(String[] args) {
		GPay obj=new GPay();
		obj.completeTransaction();

	}

}
