package Task;

public class Order {

	int number;
	String dish1,dish2,dish3;
	
	Order []orders = new Order[10];
	
	
	
	public Order (int number, String dish1,String dish2,String dish3) {
		this.number = number;
		this.dish1 = dish1;
		this.dish2 = dish2;
		this.dish3 = dish3;
		
		
		
	}

	public void addOrder(int i, int number, String dish1,String dish2,String dish3){
		orders[i] = new Order(number, dish1, dish2, dish3);
				
	}
	
	public void delOrder(int i){
		orders[i]=null;
				
	}
		
		
}
