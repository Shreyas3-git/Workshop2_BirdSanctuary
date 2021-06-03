package BirdSanctuary;

import org.junit.function.ThrowingRunnable;

public class Duck extends Birds implements Flyable, Swimmable {
    static int count;
   
    public Duck(String id) {
 	   this.id = id;
 	   colour = Colour.WHITE;
    }
    
    @Override
    public void eat() {
    	System.out.println(id + " " + "Duck is eating");
    }
    
    @Override
    public void fly() {
    	System.out.println(id + " " + "Duck is flying");
    }
    
    @Override
    public void swim() {
    	System.out.println(id + " " + "Duck is swimming");
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
	
