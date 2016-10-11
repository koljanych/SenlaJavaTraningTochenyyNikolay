package Task;

public class Restourant {

	public static void main(String[] args) {
		Menu menu = new Menu(null, 0);
		Order order = new Order(0, null, null, null);
		Cooks cooks = new Cooks (null, 0);
		
		System.out.println("Adding the dishes on the menu");
		menu.addInMenu("sup", 0, 17);
		menu.addInMenu("sup", 1, 27);
		menu.addInMenu("sup", 2, 127);
		menu.addInMenu("sup", 3, 1327);
		menu.addInMenu("sup", 4, 1257);
		System.out.println("Show menu");
		menu.showMenu();
		
		System.out.println("Forming orders");
		order.addOrder(0, 1, menu.menus[1].names, menu.menus[1].names, menu.menus[1].names);
		order.addOrder(1, 2, menu.menus[3].names, menu.menus[1].names, menu.menus[1].names);
		order.addOrder(2, 3, menu.menus[1].names, menu.menus[4].names, menu.menus[1].names);
		order.addOrder(3, 4, menu.menus[0].names, menu.menus[1].names, menu.menus[1].names);
		order.addOrder(4, 5, menu.menus[1].names, menu.menus[1].names, menu.menus[0].names);
		
		System.out.println("Adding cooks");
		cooks.addCook("Vasya", 0, 0);
		cooks.addCook("Petya", 1, 3);
		System.out.println("Show cooks");
		cooks.showCoocs();
		

	}

}
