class Client {
    public String name; 
    public boolean passport; 
    
    
    public void haveAPassport() {
	    System.out.println("method haveAPassport");
	    
    }    
    public void noPassport() {
        System.out.println("method noPassport");
    }
    // �����������
    public Client() {
    System.out.println("����������� ������ Client");
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
    // �����������
    public Bank(Led l) {
    led=l;	
	System.out.println("����������� ������ Bank");
	
    }
}

class Led { //������������ ������� �������� ������ � ���������
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
       
    // �����������
    public Led() {
    bankAccount= new BankAccount();	
    System.out.println("����������� ������ Led");
	
    }
}

class Id { //������������ ������� �������� ������ � ���������
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
       
    // �����������
    public Id() {
   	System.out.println("����������� ������ Id");
	
    }
}
class BankAccount { //������������ ������� �������� ������ � ���������
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
      
    // �����������
    public BankAccount() {
    System.out.println("����������� ������ BankAccount");
	
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