import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
	
	// ***Contains any Songs or SongGroups that are added to this ArrayList
//	SongComponent hem list hem de superclass oldu�undan poly 
//	yoluyla SongGroup ve Song subclasslar� i�in ekleme, ��karma vs yap�labilir, 
//	ve yap�l�yor a�a��daki metodlarda***
	ArrayList<SongComponent> songComponents = new ArrayList<>();
	
	String groupName;
	String groupDescription;
	
	public SongGroup(String newGroupName, String newGroupDescription){
		
		groupName = newGroupName;
		groupDescription = newGroupDescription;
		
	}
	
	public String getGroupName() { return groupName; }
	public String getGroupDescription() { return groupDescription; }
	
	public void add(SongComponent newSongComponent) {
		
		songComponents.add(newSongComponent);
		
	}
	
	public void remove(SongComponent newSongComponent) {
		
		songComponents.remove(newSongComponent);
		
	}
	
	public SongComponent getComponent(int componentIndex) {
//		**needless casting since we stated the parameter ("SongComponent") to the list above**
		return (SongComponent)songComponents.get(componentIndex);
		
	}
	
//	***recursiondan faydalan�l�yor***
	public void displaySongInfo(){
		
		System.out.println(getGroupName() + " " +
				getGroupDescription() + "\n");
		
		// ***Cycles through and prints any Songs or SongGroups added
		// to this ArrayList songComponents***
//		*iterator yerine for loopda kullan�labilirdi*
		Iterator<SongComponent> songIterator = songComponents.iterator();
		
		while(songIterator.hasNext()) {
//			**needless casting since we stated the parameter ("SongComponent") to the iterator above**
			SongComponent songInfo = (SongComponent) songIterator.next();
			
			songInfo.displaySongInfo();
			
		}
		
	}
	
}