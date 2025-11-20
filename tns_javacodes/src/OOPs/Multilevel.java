package OOPs;

class Device
{
	void deviceType()
	{
		System.out.println("I am an electronic device");
	}
}

class Phone extends Device
{
	void brand()
	{
		System.out.println("Brand : samsumng");
	}
}
class SmartPhone extends Phone
{
	void feature() {
		System.out.println("Feature : Touchscreen , camera , internet");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		SmartPhone obj=new SmartPhone ();
		obj.deviceType();
		obj.brand();
		obj.feature();

	}

}
