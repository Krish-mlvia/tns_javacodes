package org.tnsif.accenture.java.interfacedemo;

class EmailNotification implements NotificationService
{
	@Override
	public void notifyUser(String message) {
		System.out.println("Sending Email :"+ message);
	}
}

class SMSNotification implements NotificationService
{

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending message :"+message);
		
	}
	
}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		NotificationService email=new EmailNotification();
		NotificationService sms=new SMSNotification();
		
		email.notifyUser("Assignment Uploaded");
		sms.notifyUser("class ast 10am");
		
	}

}
