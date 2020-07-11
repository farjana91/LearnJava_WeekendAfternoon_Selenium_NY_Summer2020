package basic;

public class LearnUseAccessModifier {
	
	// Access Modifier/ Access Specifier: where you can access and where you can not access
	// public: From any package and any class you can take access
	// private: From same class only.
	// protected: From same package and any class from that package you can take access
	// default: Public
	
	
	// type main ====> ctrl+space button then Hit Enter    Mac: ctrl+ space button
	// sout+ctrl+space button then Hit Enter    Mac: ctrl+ space button
	
	
	public static void main(String[] args) {
		System.out.println();
	}
	
	private static void display() {
		System.out.println("Display");
	}
	
	public static void TvDisplay() {
		System.out.println("TV Display");
	}
	
	protected static void mobileDisplay() {
		System.out.println("Mobile Display");
	}
	
	void computerDisplay() {
		
	}
	
	

}
