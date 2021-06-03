package BirdSanctuary;
public  class Parrot extends Birds implements Flyable{
   static int count;
   
   public Parrot(String id) {
	   this.id = id;
	   colour = Colour.GREEN;
   }
   
   @Override
   public void fly() {
	   System.out.println(id + " " + "Parrot is flying");
   }
   
   @Override
   public void eat() {
	   System.out.println(id + " " + "Parrot is eating");
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

