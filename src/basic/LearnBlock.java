package basic;

public class LearnBlock {

	{ // block start

		// block

		String name = "James";
		System.out.println(name);
		

	} // block end
	
	
	
	
	public void display() {
		String name="Waqas";
		System.out.println("TV Display");
	}

	public static void main(String[] args) {

		// Create object
		LearnBlock obj = new LearnBlock();

		// System.out.println(LearnBlock.name);
		obj.display();

	}

}
