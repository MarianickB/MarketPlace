
public class Customer {
	private String name;
	private int balance;
	private Basket products;
	
	public Customer (String name, int balance) {
		this.name=name;
		this.balance=balance;
		products = new Basket(); 		
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance; 
	}
	
	public Basket getBasket() {
		return this.products;
	}
	
	public int addFunds(int addedfunds) {
		if (addedfunds < 0) {
			throw new IllegalArgumentException("Added funds must be positive");
		}
		
		else {
			balance = balance + addedfunds;
			return balance;
		}
		
	}
	
	public void addToBasket(MarketProduct productadded) {
		products.add(productadded);
	}
	
	public void removeFromBasket(MarketProduct productremoved) { 		
		products.remove(productremoved);
	}
	
	public String checkOut() {
		
		if (balance < products.getTotalCost()) {
			throw new IllegalStateException("Not enough funds");
		}
		
		
		else {
			String temp = products.toString();
			balance = balance - (products.getTotalCost());

			
			products.clear(); 
			return temp;							

		}
		
	}
}
