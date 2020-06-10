package interfaceEx;
class HPComboDevice implements Printer,Scanner {

	@Override
	public void scan() {
		System.out.println("HP uses 400 dpi functionality");
		
	}

	@Override
	public void print() {
		System.out.println("HP uses RGB color model for print functionality");
		
	}

	@Override
	public void price() {
		System.out.println("Hp model cost $500");
		
	}
	
}

class CannonConboDevice implements Printer,Scanner{

	@Override
	public void scan() {
		System.out.println("Cannon uses default 300 dpi");
		
	}

	@Override
	public void print() {
		System.out.println("Cannon uses CMY color model for print functionality");
		
	}

	@Override
	public void price() {
		System.out.println("Cannon model cost is $450");		
	}
	
}
public class ComboDeviceExample {

	public static void main(String[] args) {
		HPComboDevice hp1234 = new HPComboDevice();
		hp1234.print();
		hp1234.scan();
		hp1234.price();
		
		hp1234.features();  // declared default method in Printer Interface.
		
		Printer.message("Hello"); // declared message as static in printer interface.
		
		
		CannonConboDevice cn1234 = new CannonConboDevice(); // concrete object
		cn1234.print();
		cn1234.scan();
		cn1234.price();
		
		int copy = Printer.noofCopies;
		// Donot use as below, though allowed
		//int copies = cn1234.noofCopies;
		//System.out.println("No of copies : " +copies);
        
		
		Printer printRefObj = cn1234;   // REference object.
		
		int length = Scanner.scanLength;
		
		Scanner.processed();
		
		Scanner scanRefObj = cn1234;
		scanRefObj.verify(); // You can only see Interface Scanner related methods.
		
		Scanner.processed();
		
		printRefObj.price(); // We can only see objects related to Printer Interface
		
	}

}
