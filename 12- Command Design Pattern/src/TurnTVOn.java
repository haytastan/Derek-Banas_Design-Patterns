public class TurnTVOn implements Command {
//	**TurnDeviceOn dense daha do�ru olurdu (tv'nin yan� s�ra radyoyu da niteliyor)**

	ElectronicDevice theDevice;
	
//	***TurnTVOn metoduna pass edilen arg, ElectronicDevice newDevice = new Television() �eklinde de
//	Television newDevice = new Television() �eklinde de olu�abilir ve poly'nin anlam� kaybolmaz***
	public TurnTVOn(ElectronicDevice newDevice){
//		*** TurnTVOn metodunun parametresi "(Television newDevice)" olamaz
//		zira hem poly'nin anlam� kalmaz hem de TurnTVOn'a pass edilen arg ElectronicDevice t�r�nde.
//		yukar�daki TurnTVOn metoduna pass edilen argument Television t�r�nde olabilir. 
//		bu durumda parametre"(Television newDevice)" da olabilir (ama yine poly'nin anlam� kalmaz) ***
		
		theDevice = newDevice;
		
	}
	
	public void execute() {
		
		theDevice.on();
		
	}

	public void undo() {
		
		theDevice.off();
		
	}
	
}