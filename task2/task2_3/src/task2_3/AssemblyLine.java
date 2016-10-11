package task2_3;

public class AssemblyLine implements IAssemblyLine {
	public Product product = new Product();
	public LineStep linestep = new LineStep();

	@Override
	public String assembleProduct() {
		// TODO Auto-generated method stub
		System.out.println("assembly of finished copies");
		return null;
	}
	
	LineStep lineStep;
	public AssemblyLine(LineStep ls){
		lineStep=ls;
	}

}
