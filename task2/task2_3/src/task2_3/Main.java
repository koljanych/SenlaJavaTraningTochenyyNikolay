package task2_3;

public class Main {
	static String step;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		AssemblyLine al = new AssemblyLine(null);
		
		al.linestep.buildProductPart();
		al.assembleProduct();
		al.product.installFirstPart();
		al.product.installSecondPart();
		al.product.installThirdPart();
		System.out.println("The handle is ready!");
		
		
		
		
	}

}
