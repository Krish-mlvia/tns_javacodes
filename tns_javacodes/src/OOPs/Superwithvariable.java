package OOPs;

class Notification  //parent class
{
	String message="Default Notification";
}
class PushNotification extends Notification //sub class
{
	String message="Push notification from whatsapp";
	
	
	void showNotification()
	{
		System.out.println("Child message :"+message);
		System.out.println("Parent message :"+super.message);
	}
}

public class Superwithvariable {

	public static void main(String[] args) {
		PushNotification obj=new PushNotification();
		obj.showNotification();

	}

}
