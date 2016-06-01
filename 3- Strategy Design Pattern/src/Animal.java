public class Animal {
	
	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;
	
	// Instead of using an interface in a traditional way
	// we use an instance variable that is a subclass
	// of the Flys interface.
	
	// Animal doesn't care what flyingType does, it just
	// knows the behavior is available to its subclasses
	
	// This is known as Composition : Instead of inheriting
	// an ability through inheritance the class is composed
	// with Objects with the right ability
	
	// Composition allows you to change the capabilities of 
	// objects at run time! (aka behaviourism)
//	behavior can change without side effects since it is not tied
//	to the superclass or subclass
	public Flys flyingType;
//	we used the instance variable of the Flys interface
// and related the Animal to Flys
//	***UML'de Implement/extend etmenin yan�s�ra variable yaratmak, 
//	constructor yaratmak ve method ile �a��rmak
//	etkile�im yaratmak i�in sebeplerdendir***
	
	public void setName(String newName){ name = newName; }
	public String getName(){ return name; }
	
	public void setHeight(double newHeight){ height = newHeight; }
	public double getHeight(){ return height; }
	
	public void setWeight(int newWeight){ 
		if (newWeight > 0){
			weight = newWeight; 
		} else {
			System.out.println("Weight must be bigger than 0");
		}
	}
	public double getWeight(){ return weight; }
	
	public void setFavFood(String newFavFood){ favFood = newFavFood; }
	public String getFavFood(){ return favFood; }
	
	public void setSpeed(double newSpeed){ speed = newSpeed; }
	public double getSpeed(){ return speed; }
	
	public void setSound(String newSound){ sound = newSound; }
	public String getSound(){ return sound; }
	
	/* ***** BAD CODING *****
	* You don't want to add methods to the super class.
	* You need to separate what is different between subclasses
	* and the super class
	
	public void fly(){
		
		System.out.println("I'm flying");
		
	}
	
	*Also, you dont want to create abstract method 
	*(for creating duplicates inside subclasses)
	
	public abstract void fly();
	
	*There are 2 principles which we should follow:
	*Eliminating duplicates and 
	*eliminate any techniques that cause one class to effect the other
	*in a negative way
	*/
	
	// Animal pushes off the responsibility for flying to flyingType
//	GETTER
	public String tryToFly(){
		
		return flyingType.fly();
		
	}
	
	// If you want to be able to change the flyingType dynamically
	// add the following method
//	SETTER
	public void setFlyingAbility(Flys newFlyType){
		
		flyingType = newFlyType;
		
	}
	
}