package Task;

public class Cooks {

	String names;
	int order;
	
	Cooks []cooks = new Cooks[5];
	
	
	
	
	public Cooks (String name, int order) {
		this.names = name;
		this.order = order;
		
		
	}

	public Cooks(Object name, int i) {
		// TODO Auto-generated constructor stub
	}

	public void addCook(String name, int i, int order){
		cooks[i] = new Cooks(name, order);
				
	}
	
	public void delCook(int i){
		cooks[i]=null;
				
	}
	
	public void showCoocs(){
		
		for(int i=0; i<cooks.length; i++ ){
			if (cooks[i]==null){
			System.out.println(cooks[i]);
			}else {
			System.out.print(cooks[i].names); 
			
			System.out.println(cooks[i].order);}
		
			
		}
			
		
	}
	
	

}
