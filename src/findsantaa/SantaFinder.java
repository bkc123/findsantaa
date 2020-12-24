package findsantaa;

public class SantaFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SantaSuspects santaSuspects = new SantaSuspects(10);
		santaSuspects.addSuspect("Bob Bezanga");
		santaSuspects.addSuspect("Sally Zimmers");
		santaSuspects.addSuspect("Peter Pinkelton");
		santaSuspects.addSuspect("Bobby Drop Tables");
		santaSuspects.addSuspect("Rudolph Rednose");
		santaSuspects.addSuspect("Bob Ross");
		santaSuspects.addSuspect("Ubiga Altman");
		santaSuspects.addSuspect("Tony Ross");
		santaSuspects.addSuspect("Aaron Rogers");
		santaSuspects.addSuspect("Yolo Once");
		santaSuspects.addSuspect("Yoka Yamalla");
		santaSuspects.addSuspect("Big Show");
		santaSuspects.addSuspect("Doug Dimmadome");

		santaSuspects.printSuspects();
	
	}

}
