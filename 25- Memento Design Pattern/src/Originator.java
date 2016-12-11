// Memento Design Pattern

//	***mementonun liste eklenmesi (save) esnas�nda originator -> memento -> caretaker s�ras� varken 
//	mementonun listten ��kar�lmas� (undo ve redo) esnas�nda caretaker -> memento -> originator s�ras� olu�ur***

public class Originator{
	
	private String article;

	// *Sets the value for the article*
//	**for save button**
	public void set(String newArticle) { // setter
		System.out.println("From Originator: Current Version of Article\n"+newArticle+ "\n");
	    this.article = newArticle; 
	}

	// *Creates a new Memento with a new article*
//	**for save button**
	public Memento storeInMemento() { // setter within getter
	    System.out.println("From Originator: Saving to Memento");
	    return new Memento(article); 
	}
	   
	// Gets the article currently stored in memento
//	**for undo and redo buttons**
	public String restoreFromMemento(Memento memento) { // setter & getter
		   
		article = memento.getSavedArticle(); 
		System.out.println("From Originator: Previous Article Saved in Memento\n"+article + "\n");
		return article;
//	   ***undo ve redo butonlar� i�in return ediyor***
	}
	
}