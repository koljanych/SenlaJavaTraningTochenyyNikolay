package task2_3;

public class Product implements IProduct {
	public AssemblyLine assemblyLine;

	
	@Override
	public void installFirstPart() {
		// TODO Auto-generated method stub
		System.out.println("set the pen body");
		
		
	}

	@Override
	public void installSecondPart() {
		// TODO Auto-generated method stub
		System.out.println("set spring");
		
	}

	@Override
	public void installThirdPart() {
		// TODO Auto-generated method stub
		System.out.println("install the handle rod");
		
	}
	IProductPart iproductPart;
	
	public Product(){
		iproductPart = new ProductPart();
		
	}

}
