package Task;

public class Menu {
	String names;
	int prices;
	
	Menu []menus = new Menu[5];
	
	
	
	public Menu(String name, int price) {
		this.names = name;
		this.prices = price;
		
	}

	public void addInMenu(String name, int i, int price){
		menus[i] = new Menu(name, price);
				
	}
	
	public void delInMenu(int i){
		menus[i]=null;
				
	}
	
	public void showMenu(){
		for(int i=0; i<menus.length; i++ ){
			if (menus[i]==null){
			System.out.println(menus[i]);
			}else {System.out.print(menus[i].names); System.out.println(menus[i].prices);}
		
			
		}
			
		
	}
	
	

}
