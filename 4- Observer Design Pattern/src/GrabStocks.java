public class GrabStocks{
	// basic summary: observer arraylisti olu�ur (by StockGrabber)
	// observer yarat�l�r ki sonradan update g�nderilsin (by StockObserver and StockGrabber)
	// stockPrice set edilir ve Observera yollan�r (by StockGrabber and StockObserver)
	public static void main(String[] args){
		
		// Create the Subject (aka publisher) object
		// It will handle updating all observers 
		// as well as deleting and adding them
		StockGrabber stockGrabber = new StockGrabber();
//		*** !subclass var diye 'super class = sub class' yaz�lmak zorunda de�il
//		Subject stockGrabber = new StockGrabber(); yaz�labilmesi i�in
//		setIBMPrice, setAAPLPrice etc metodlar�n�n Subject interface i�inde
//		olmas� gerekecekti***
		
		// Create an Observer (aka subscriber; add to the arraylist) that will 
		// be sent updates from Subject 
		// !we'll be able to access methods of StockGrabber class with stockGrabber arg
		// register metodu stockGrabber arg sayesinde eri�ilebilir
		StockObserver observer1 = new StockObserver(stockGrabber); 
		// ***argument yollan�nca polymorphism olur: Subject stockGrabber=stockGrabber;***
//		***Observer observer1 = new StockObserver(stockGrabber); olabilirdi***
		
		// hem set eder hem de notify metodunu �a��rarak dolayl� yoldan print
		stockGrabber.setIBMPrice(197.00); 
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		
		StockObserver observer2 = new StockObserver(stockGrabber); 
		// object created for the constructor
		
		// hem observer 1'e hem de 2'ye notification yollan�r
		stockGrabber.setIBMPrice(197.00); 
		stockGrabber.setAAPLPrice(500.60);
		stockGrabber.setGOOGPrice(300.40);
		
		// Delete one of the observers
//		observer 1 no longer receives updates
		stockGrabber.unregister(observer2); //***poly***
		// register metodu StockObserver constructor �zerinden �a��r�lm��t�
		
		stockGrabber.setIBMPrice(180.00);
		stockGrabber.setAAPLPrice(327.60);
		stockGrabber.setGOOGPrice(346.40);
		
		
		//***2. part***
		
		// Create 3 threads using the Runnable interface
		// GetTheStock implements Runnable, so it doesn't waste 
		// its one extendable class option
		
//		calls the constructor as well as creating ref var
//		alt: GetTheStock getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.60);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.40);
		
		// Call for the code in run to execute 
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
//		run metodu yukar�da kendine ait olan her bir objectten sonra bile yarat�lm�� olsa toptan print ederdi
//		run metodu �a��r�lmadan constructor yaratman�n ve value set etmenin anlam� yok
		
	}
	
}