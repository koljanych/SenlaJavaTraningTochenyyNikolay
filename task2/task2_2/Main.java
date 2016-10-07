class Client {
    public String name; 
    public boolean passport; 
    
    
    public void haveAPassport() {
	    System.out.println("method haveAPassport");
	    
    }    
    public void noPassport() {
        System.out.println("method noPassport");
    }
    // конструктор
    public Client() {
    System.out.println("Конструктор класса Client");
    }
}

class Bank {
    public String name, address; 
    public Client client;
    public BankAccount bankAccount;
    
    public void addClient() {
    	client = new Client();
	    System.out.println("method addClient");
    }    
    public void removeClient() {
        System.out.println("method removeClient");
    }
   Led led;
    // конструктор
    public Bank(Led l) {
    led=l;	
	System.out.println("Конструктор класса Bank");
	
    }
}

class Led { //аббревиатура полного названия класса в диаграмме
    private String accountList; 
    BankAccount bankAccount;
        
    public void findAccount() {
	      System.out.println("method findeAccount");
    }    
	public void addAccount(){
		System.out.println("method addAccount");	
	}
	public void closeAccount(){
		System.out.println("method closeAccount");
	}
       
    // конструктор
    public Led() {
    bankAccount= new BankAccount();	
    System.out.println("Конструктор класса Led");
	
    }
}

class Id { //аббревиатура полного названия класса в диаграмме
    private String accountList; 
    public BankAccount bankAccount; 
       
    public void findAccount() {
	      System.out.println("method findeAccount");
    }    
	public void addAccount(){
		System.out.println("method addAccount");	
	}
	public void closeAccount(){
		System.out.println("method closeAccount");
	}
       
    // конструктор
    public Id() {
   	System.out.println("Конструктор класса Id");
	
    }
}
class BankAccount { //аббревиатура полного названия класса в диаграмме
    private int sum,number;
    public String dataOpen; 
           
    public void refill() {
	      System.out.println("method refill");
    }    
	public void close(){
		System.out.println("method close");	
	}
	public void showDate(){
		System.out.println("method dataOpen");
		
	}
      
    // конструктор
    public BankAccount() {
    System.out.println("Конструктор класса BankAccount");
	
    }
}

class Test{
Client c = new Client();

Led l = new Led();
Id i = new Id();
BankAccount ba = new BankAccount();

	void k1(){
		l.findAccount();
		ba.showDate();
	
	}
	void k2(){
		i.findAccount();
		ba.refill();
	
	}


}

public class Main {
    public static void main(String[] args) {
    	Test test = new Test();
    	test.k1();
    	test.k2();
    	
       
  }
}