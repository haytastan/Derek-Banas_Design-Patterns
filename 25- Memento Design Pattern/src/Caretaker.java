// Memento Design Pattern Tutorial

//	***mementonun liste eklenmesi (save) esnas�nda originator -> memento -> caretaker s�ras� varken 
//	mementonun listten ��kar�lmas� (undo ve redo) esnas�nda caretaker -> memento -> originator s�ras� olu�ur***

import java.util.ArrayList;

class Caretaker {
   
	// Where all mementos are saved
	
	ArrayList<Memento> savedArticles = new ArrayList<Memento>();

	// Adds memento to the ArrayList

	public void addMemento(Memento m) { savedArticles.add(m); }
   
	// Gets the memento requested from the ArrayList
	
	public Memento getMemento(int index) { return savedArticles.get(index); }
} 