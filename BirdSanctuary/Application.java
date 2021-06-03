package BirdSanctuary;

public class Application  {

	public static void main(String[] args) throws BirdSanctuaryException {
		System.out.println("WELCOME TO BIRD SANCTUARY");
		
		BirdSanctuaryManager birdSancturyManager = new BirdSanctuaryManager();
		
		Parrot parrot1 = new Parrot("p1");
		Parrot parrot2 = new Parrot("p2");
		Parrot parrot3 = new Parrot("p3");
		
		Duck duck1 = new Duck("d1");
		Duck duck2 = new Duck("d2");
		Duck duck3 = new Duck("d3");
		
		Penguin penguin1 = new Penguin("pn1");
		Penguin penguin2 = new Penguin("pn2");
		Penguin penguin3 = new Penguin("pn3");
		
		try {
			birdSancturyManager.add(parrot1);
		}catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}
		try {
			birdSancturyManager.add(parrot2);
		}catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}
		try {
			birdSancturyManager.add(parrot3);
		}catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}
		try {
			birdSancturyManager.add(duck1);
		}catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}
		try {
			birdSancturyManager.add(duck2);
		}catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}
		try {
			birdSancturyManager.add(duck3);
		}catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}
		try {
			birdSancturyManager.add(penguin1);
		}catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}
		try {
			birdSancturyManager.add(penguin2);
		}catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}
		try {
			birdSancturyManager.add(penguin3);
		}catch (BirdSanctuaryException e) {
			e.printStackTrace();
		}
		
		birdSancturyManager.remove(parrot3);
		
		birdSancturyManager.print();	
		
		birdSancturyManager.printEatables();
		birdSancturyManager.printFlyables();
		birdSancturyManager.printSwimable();
		
		System.out.println("Count Parrot: " +Parrot.count);
		System.out.println("Count Duck: " +Duck.count);
		System.out.println("Count Penguin: " +Penguin.count);
		
		System.out.println("Total Birds: " + Birds.totalCount);
		
	}
}
