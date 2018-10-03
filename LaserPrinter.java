package lab8_printer;

public class LaserPrinter extends Printer {
	
	private int remainingToner;

	public void LaserPrinter(int sNumber) {
		remainingToner = 100;
	}
	
	public int getRemainingToner() {
		return remainingToner;
	}

	@Override
	public void print() {
		if(remainingToner > 0) {
			remainingToner -= 10;
			System.out.println("LaserPrinter is printing. Remaining toner: " + remainingToner + "%");
		} else if(remainingToner == 0) {
			System.out.println("artridge is empty");
		}
	}
}
