/*
 *  Author: Brittanie Pham
 */
package lab8_printer;

public abstract class Printer {
	
	private int serialNumber;
	
	public Printer(int number) {
		serialNumber = number;
	}
	
	public abstract void print();
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " #" + serialNumber;
	}
}
