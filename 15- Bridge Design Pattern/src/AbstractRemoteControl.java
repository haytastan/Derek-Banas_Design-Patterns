// Abstraction

// This is an abstract class that will represent numerous
// ways to work with each device

public abstract class AbstractRemoteControl{
	
	// A reference to a generic device using aggregation
	
	private EntertainmentDevice theDevice;
	
	public AbstractRemoteControl(EntertainmentDevice newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void buttonFivePressed() {
		
		theDevice.buttonFivePressed();
		
	}
	
	public void buttonSixPressed() {
		
		theDevice.buttonSixPressed();
		
	}
	
	public void deviceFeedback(){
		
		theDevice.deviceFeedback();
		
	}
	
	public void buttonSevenPressed() {
		
		theDevice.buttonSevenPressed();
		
	}
	
	public void buttonEightPressed() {
		
		theDevice.buttonEightPressed();
		
	}
	
//	**buttonNinePressed() subclass ile implement edilirken di�er metodlar (deviceFeedback() vs)
//	EntertainmentDevice abstract class� ve onun subclasslar� ile anlam kazan�r**
	public abstract void buttonNinePressed();
	
}