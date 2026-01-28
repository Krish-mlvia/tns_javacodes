package org.tnsif.accenture.java.interfacedemo;

class SmartLight implements SmartDevice 
{

	@Override
	public void turnOn() {
		System.out.println("Smart light is On");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Smart light is off");
		
	}

	@Override
	public void getStatus() {
		
		System.out.println("Smart Light is in standby  mode");
	}
	
}

public class Interfacedemo {
	public static void main(String[] args) {
		SmartDevice  obj= new SmartLight();
		obj.turnOn();
		obj.turnOff();
		obj.getStatus();
	}

}
