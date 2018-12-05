
public class Jam extends MarketProduct {
	private int numJam;
	private int price;
	
	public Jam (String name, int numJam, int price) {
		super (name);
		this.numJam = numJam;
		this.price = price;
	}
	
	public int getCost() {
		return numJam*price; 
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Jam) {
			
			Jam object = (Jam) obj;
			if (object.getName().equals(this.getName()) && (object.price == price) && (object.numJam == this.numJam))
					return true;
		}
		
		return false;
			
	}
}
