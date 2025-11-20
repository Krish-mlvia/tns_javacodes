package OOPs;

public class Abstraction {

	public static void main(String[] args) {
		SureshDemo obj=new SureshDemo();
		obj.calling();
		obj.SatelliteComm();
		obj.AIIntegration();
		obj.HealthMonitoring();
	}

}
abstract class MaheshDemo   //2023
{
	public void calling()
	{
		System.out.println("calling");
	}
	public abstract void AIIntegration();
	public abstract void SatelliteComm();
	public abstract void HealthMonitoring();
}

abstract class RameshDemo  extends MaheshDemo //2024
{

	@Override
	public void AIIntegration() {
		System.out.println("AIIntegration is done");
		
	}

	@Override
	public abstract  void SatelliteComm(); 
		

	@Override
	public abstract  void HealthMonitoring() ;
	
}

class SureshDemo extends RameshDemo //2025
{

	@Override
	public void SatelliteComm() {
		System.out.println("SatelliteComm is done");
		
	}

	@Override
	public void HealthMonitoring() {
		System.out.println("HealthMonitoring is done");

	}

}
