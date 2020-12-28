package findsantaa;

import java.util.Scanner;

public class SantaFinder {

public static void main(String[] args) {
		
	// object created for SantaSuspects
		SantaSuspects santaSuspects = new SantaSuspects(20);
		
		//call addSuspect to add suspects in the created array object
		santaSuspects.addSuspect("bob@bezanga.com");
		santaSuspects.addSuspect("sally@zimmers.com");
		santaSuspects.addSuspect("peter@pinkelton.com");
		santaSuspects.addSuspect("bobby.drop@tables.com");
		santaSuspects.addSuspect("rudolph@rednose.com");
		santaSuspects.addSuspect("bob@ross.com");
		santaSuspects.addSuspect("ubiga@altman.com");
		santaSuspects.addSuspect("tony@ross.com");
		santaSuspects.addSuspect("aaron@rogers.com");
		santaSuspects.addSuspect("yolo@once.com");
		santaSuspects.addSuspect("yoka@yamalla.com");
		santaSuspects.addSuspect("big@show.com");
		santaSuspects.addSuspect("boug@dimmadome.com");
		
		//Display message requesting user for input
		System.out.println("Provide a name to search for:");
		// create Scanner object
		Scanner scanner = new Scanner(System.in);
		//use Scanner object scanner for String input from users
		String searchFor = scanner.nextLine();
		
		
		boolean foundMatch = santaSuspects.foundMatch(searchFor);
		if (foundMatch) {
			System.out.println(searchFor + " is indeed a santa suspect");
		} else {
			System.out.println(searchFor + " is not a santa suspect");
		}
		
	}


}
