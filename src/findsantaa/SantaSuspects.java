package findsantaa;



public class SantaSuspects {

	String[] suspects;
	
	int nextIndex = 0;
	int arraySize = 0;
	
	public SantaSuspects(int size) {
		this.arraySize = size;
		this.suspects = new String[size];
	}
	
	public void addSuspect(String suspect) {
		this.suspects[this.nextIndex] = suspect;
		this.nextIndex++;
		if (this.nextIndex >= this.arraySize) {
			this.nextIndex = 0;
		}
	}
	
	public void printSuspects() {
		for (int i = 0; i < this.suspects.length; i++) {
			System.out.println(this.suspects[i]);
		}
	}
	
}
