package lab8_printer;
/*
 *  Author: Brittanie Pham
 */

public abstract class PrinterApp {
	
	private int serialNumber;
	
	public void Printer(int number) {
		serialNumber = number;
	}
	
	public abstract void print();
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " #" + serialNumber;
//		return super.toString();
	}
}
