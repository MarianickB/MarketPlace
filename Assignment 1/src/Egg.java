
public class Egg extends MarketProduct {
	private int number;
	private int price;
	
	public Egg (String name, int number, int price) {
		super (name);
		this.number = number;
		this.price = price;
	}
	
	public int getCost() {
		return (int) ((number*price)/12); 
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Egg) {
			
			Egg object = (Egg) obj;
			if (object.getName().equals(this.getName()) && (object.price == this.price) && (object.number == this.number))
					return true;
		}
		
		return false;
			
	}
}
