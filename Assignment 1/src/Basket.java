
public class Basket {
	private MarketProduct[] arr;
	private int size;

	public Basket() {
		size=0;
		arr = new MarketProduct[0];
	
	}
	
	
	public MarketProduct[] getProducts() {							 
		MarketProduct [] newArr = arr.clone(); 
		return newArr;
	}
		
					
	public void add(MarketProduct newProd) {
		MarketProduct [] newArr = new MarketProduct [size + 1];

		for (int i=0; i<size; i++) { 
			newArr[i]=arr[i];
		}
		newArr[size] = newProd;
		arr = newArr;
		size++;
	}
	
	public boolean remove(MarketProduct rem) {				
		boolean result = false;
		int itodelete=0;
		
		for (int i=0; i<size; i++) {
	
			if (arr [i] != null && arr [i].equals(rem)) {
				
				arr[i] = null;
				
				result = true;
				
				itodelete = i;
				
				break;				
				}

			}
		MarketProduct [] newArr = new MarketProduct [size - 1];

		for(int i=0; i<size; i++) {
						
			if(i==itodelete) {
				continue;
			}
			
			if(i>itodelete) {
				newArr[i-1] = arr[i];					
			}
			
			else {
				newArr[i]=arr[i];
			}
			
		}
		size--;
		arr=newArr;
		return result;

	}
		
	// Make a new array that has no elements in it.
	public void clear() {
		MarketProduct [] newArr = new MarketProduct [0];
		arr = newArr;
		}
		
	public int getNumOfProducts() {			
		return size;
	}
	
	public int getSubTotal() {  
		int subTotal= 0;
		
		for (int i=0; i<size; i++) {
			subTotal = subTotal + (arr[i].getCost());
		}
		return subTotal;
	}
	
	public int getTotalTax() {			
		int tax = 0;
		
		for (int i=0; i<size; i++) {
			
			if (arr[i] != null && (arr[i].getClass()).equals(Jam.class)) { 
				
				tax = (int) (tax + (arr[i].getCost() * 0.15));
				
			}
			
		}
		
		return tax;
	}
	
	public int getTotalCost() {
		int totalCost;
		
		totalCost = (this.getTotalTax() + this.getSubTotal());
		
		return totalCost;
	}
	
	public String toString() {			
		String receipt = "";

		for(int i=0; i<size; i++) {
			if(arr[i].getCost() <=0) {
				receipt+=arr[i].getName() + "\t - \n";	
			}
			else { 
				double costincents = (double) arr[i].getCost()/100;
				receipt+=arr[i].getName() + "\t" + String.format("%.2f", costincents) + "\n";
			}
			
		}
		
		double subTotal = (double) this.getSubTotal()/100;
		double totalTax = (double) this.getTotalTax()/100;
		double totalCost = (double) this.getTotalCost()/100;
	
		
		receipt+= "\n";
		receipt+= "Subtotal" + "\t" + String.format("%.2f", subTotal) + "\n";
		receipt+= "Total tax" + "\t" + String.format("%.2f", totalTax) + "\n";
		receipt+= " \n";
		receipt+= "Total cost" + "\t" + String.format("%.2f", totalCost);
		
		return receipt;
	}
}
