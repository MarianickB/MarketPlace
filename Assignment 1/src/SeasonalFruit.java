
public class SeasonalFruit extends Fruit {

	public SeasonalFruit (String name, double kg, int price) {
		super (name, kg, price);
	}
	
	public int getCost() {
		return (int)(super.getCost()*.85);
	}
		
			
}

