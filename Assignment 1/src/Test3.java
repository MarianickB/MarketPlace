
public class Test3 {

    public static void main(String[] args){

	
  Customer cust  = new Customer("Paola Pineda",10000);
  System.out.println(cust.getName());
 // System.out.println(cust.getBalance());
  //cust.addFunds(10);
  //System.out.println(cust.getBalance());
  //cust.addFunds(-10);
  //cust.checkOut();
  //cust.addToBasket(new Fruit("Blue Berry",1.5,380));
  	cust.addToBasket(new Jam("1 Blueberry Jam",1,239));
  	cust.addToBasket(new Jam("1 Marmelade",1,239));
	//cust.addToBasket(new Jam("Chocolate Jam", 1, 0));
	cust.addToBasket(new Egg("3 Large eggs", 3, 499));
	cust.addToBasket(new Fruit("1 Bananas", 1, 50));
  cust.addToBasket(new Fruit("1 Apples",1,50));
  cust.addToBasket(new Fruit(".5 Melon",.5,180));
  cust.addToBasket(new Fruit("10 Avocado",10,40));
  cust.addToBasket(new Fruit("2 Tomato",2,40));
  cust.addToBasket(new Fruit(".5 Papaya",.5,40));
  cust.addToBasket(new Fruit(".2 Blackberries",.2,40));



  cust.removeFromBasket(new Fruit(".2 Blackberries",.2,40));
  //cust.removeFromBasket(new Fruit("Blue Berry",1.5,40));
 
  //System.out.println(cust.getBasket());
  //System.out.println(cust.checkOut());
  System.out.println("Balance Before:" + cust.getBalance());
  System.out.println("Basket cost:" + cust.getBasket().getTotalCost());
  System.out.println(cust.checkOut());
  System.out.println("Balance After:" + cust.getBalance());
 
	
    } 

}
