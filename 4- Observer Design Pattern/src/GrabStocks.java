public class GrabStocks{
	// basic summary: observer arraylisti olu�ur (by StockGrabber)
	// observer yarat�l�r ki sonradan update g�nderilsin (by StockObserver and StockGrabber)
	// stockPrice set edilir ve Observera yollan�r (by StockGrabber and StockObserver)
	public static void main(String[] args){
		
		// Create the Subject (aka publisher) object
		// It will handle updating all observers 
		// as well as deleting and adding them
		StockGrabber stockGrabber = new StockGrabber();
		
		// Create an Observer (aka subscriber; add to the arraylist) that will 
		// be sent updates from Subject 
		// !we'll be able to access methods of StockGrabber class with stockGrabber arg
		// register metodu stockGrabber arg sayesinde eri�ilebilir
		StockObserver observer1 = new StockObserver(stockGrabber); 
		// object created for the constructor
		// argument yollan�nca polymorphism olur: Subject stockGrabber=stockGrabber;
		
		// hem set eder hem de ba�ka metodlar� �a��rarak dolayl� yoldan print
		stockGrabber.setIBMPrice(197.00); 
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		
		StockObserver observer2 = new StockObserver(stockGrabber); 
		// object created for the constructor
		
		// hem observer 1'e hem de 2'ye notification yollan�r
		stockGrabber.setIBMPrice(197.00); 
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		
		// Delete one of the observers
//		observer 1 no longer receives updates
		stockGrabber.unregister(observer2); 
		// register metodu StockObserver constructor �zerinden �a��r�lm��t�
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		
		// Create 3 threads using the Runnable interface
		// GetTheStock implements Runnable, so it doesn't waste 
		// its one extendable class option
		
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.60);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.40);
		
		// Call for the code in run to execute 
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
		
		
	}
	
}