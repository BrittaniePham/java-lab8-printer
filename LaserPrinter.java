package lab8_printer;

public class LaserPrinter extends PrinterApp {
	
	public int remainingToner;

	public void LaserPrinter() {
		remainingToner = 100;
	}

	@Override
	public void print() {
		if(remainingToner > 0) {
			remainingToner -= 10;
			System.out.println("LaserPrinter is printing. Remaining toner: 90%");
		} else if(remainingToner == 0) {
			System.out.println("Cartridge is empty");
		}
	}
}
