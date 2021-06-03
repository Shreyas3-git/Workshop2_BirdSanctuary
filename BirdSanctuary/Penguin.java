package BirdSanctuary;

public class Penguin extends Birds implements Swimmable {
	static int count;
	
	public Penguin(String id) {
			this.id = id;
			colour = Colour.BLACK_WHITE;
	}
	
	 @Override
	 public void eat() {
	    	System.out.println(id + " " + "Penguin is eating");
	 }
	 
	 @Override
	 public void swim() {
		 	System.out.println(id + " " + "Penguin is Swimming");
	 }
	    

	 @Override
	 public void incrementCount() {
		 	count++;
		
	 }
	
	 @Override
	 public void  decrementCount() {
		 	count--;
	 }


}
