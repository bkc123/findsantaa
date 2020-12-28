package findsantaa;

public class SantaSuspects {

	String[] suspects;
	
	int nextIndex = 0;
	int arraySize = 0;
	
	//constructor initializing the size of an [] suspects
	public SantaSuspects(int size) {
		this.arraySize = size;
		this.suspects = new String[size];
	}
	
	//method to add suspect in the [] suspects
	public void addSuspect(String suspect) {
		this.suspects[this.nextIndex] = suspect;
		this.nextIndex++;
		if (this.nextIndex >= this.arraySize) {
			this.nextIndex = 0;
		}
	}
	
	// method to print suspects from the Array list
	public void printSuspects() {
		for (int i = 0; i < this.suspects.length; i++) {
			if (null == this.suspects[i]) {
				continue;
			}
			System.out.println(i+1 + ". " + this.suspects[i]);
		}
	}
	
	// boolean method to scan through array and check if requested suspect exist in the array
	// return boolean value : true/false
	//return true if suspect exist 
	//return false if suspect doesn't exist
	public boolean foundMatch(String input) {
		for (int i = 0; i < this.suspects.length; i++) {
			if (null == this.suspects[i]) {
				continue;
			}
			if (this.suspects[i].equalsIgnoreCase(input)) {
				return true;
			}
		}
		return false;
	}
	
}