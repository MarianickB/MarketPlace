
public class Fruit extends MarketProduct {
	private double kg;
	private int price;
	
	public Fruit (String name, double kg, int price) {
		super (name);
		this.kg = kg;
		this.price = price;
	}
	
	public int getCost() {
		return (int) (kg*price); 
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Fruit) {
			
			Fruit object = (Fruit) obj;
			if (object.getName().equals(this.getName()) && (object.price == this.price) && (object.kg == this.kg))
					return true;
		}
		
		return false;
			
	}
}
