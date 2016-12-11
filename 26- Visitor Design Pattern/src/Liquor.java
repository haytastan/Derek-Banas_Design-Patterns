class Liquor implements Visitable {
	
	private double price;

	Liquor(double item) {
		price = item;
	}

	public double accept(Visitor visitor) {
		return visitor.visit(this);
		// ***with this kw it passes its own instance made in main method.
		//	this kw'�n kulan�labilmesi i�in constructor i�inde olmas� gerekmiyor***
	}

	public double getPrice() {
		return price;
	}
	
}