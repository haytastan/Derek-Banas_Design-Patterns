// Has a "Has a" relationship with Pizza. This is an
// Aggregation Relationship

// *moz and sauce classes implements all these variables and methods*
abstract class ToppingDecorator implements Pizza {

	protected Pizza tempPizza;
//	*** sub-classlar� taraf�ndan g�r�l�r ve farkl� alg�lan�r:
//	mozzarella i�in Pizza tempPizza = new PlainPizza();
//	olurken (PlainPizza, ToppingDecorator'�n subclass � veya superclass � olmad��� halde ileti�im kurulmu�)
//	tomatosauce i�in Pizza tempPizza = new Mozzarella(new PlainPizza());
//	olur (new Mozzarella i�inde new PlainPizza olmas� �nemli de�il) ***
	
	// Assigns the type instance to this attribute
	// of a Pizza
	
	// All decorators can dynamically customize the Pizza
	// instance PlainPizza because of this
	
	public ToppingDecorator(Pizza newPizza){
		
		tempPizza = newPizza;
		
	}
	
	public String getDescription() {
		
		return tempPizza.getDescription();
		
	}

	public double getCost() {
		
		return tempPizza.getCost();
		
	}
	
}