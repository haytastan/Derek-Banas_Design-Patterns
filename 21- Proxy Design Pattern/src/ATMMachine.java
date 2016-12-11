public class ATMMachine implements GetATMData {
//	***s�ras�yla nocard, (insertcard metodu ile) hascard, (insertpin metodu ile) haspin 
//	ve (requestcash metodu ile ve hesapta para yok ise) nocash classlar� kullan�l�r.
//	her class kendisinden bir sonraki ve bir �nceki aksiyonlar� ger�ekle�tirir.***
	ATMState hasCard;     
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;
	
//	*atmState changes based on conditions*
	ATMState atmState;
	
	int cashInMachine = 2000; // initial cash
	boolean correctPinEntered = false; // i�levi yok
	
	public ATMMachine(){
		
//		**with this kw, passes the instance**
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasPin(this);
		atmOutOfMoney = new NoCash(this);
		
//		initial state
		atmState = noCard;
		
		if(cashInMachine < 0){
			
			atmState = atmOutOfMoney;
			
		}
		
	}
	
	void setATMState(ATMState newATMState){
		
		atmState = newATMState;
		
	}
	
	public void setCashInMachine(int newCashInMachine){
		
		cashInMachine = newCashInMachine;
		
	}
	
	public void insertCard() {
		
		atmState.insertCard();
		
	}

	public void ejectCard() {
		
		atmState.ejectCard();
		
	}

	public void requestCash(int cashToWithdraw) {
		
		atmState.requestCash(cashToWithdraw);
		
	}

	public void insertPin(int pinEntered){
		
		atmState.insertPin(pinEntered);
		
	}
	
	public ATMState getYesCardState() { return hasCard; }
	public ATMState getNoCardState() { return noCard; }
	public ATMState getHasPin() { return hasCorrectPin; }
	public ATMState getNoCashState() { return atmOutOfMoney; }
	
	public ATMState getATMState(ATMMachine atm) { return atmState; }
	public int getCashInMachine(ATMMachine atm) { return cashInMachine; }

}