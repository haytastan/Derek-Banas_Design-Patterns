// This factory uses the EnemyShipFactory interface
// to create very specific UFO Enemy Ship

// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being ESWeapon and ESEngine

// The returned object specifies a specific weapon & engine

public class UFOEnemyShipFactory implements EnemyShipFactory{

	// Defines the weapon object to associate with the ship
//	***return type'dan dolay� poly olur ve fazla class yazma derdinden kurtulmu� oluruz***
	public ESWeapon addESGun() {
		return new ESUFOGun(); // Specific to regular UFO
//		toString metodu i�in
	}

	// Defines the engine object to associate with the ship
	
	public ESEngine addESEngine() {
		return new ESUFOEngine(); // Specific to regular UFO
//		toString metodu i�in
	}

//	yt alt:
//	@Override
//	public void addParts(EnemyShip ship) {
//		{ ship.setWeapon(addESGun()); ship.setESEngine(addESEngine()); };
//		
//	}
}