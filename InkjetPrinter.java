package lab8_printer;

public class InkjetPrinter extends Printer{
	
	private int remainingCartridge;

	public void InkjetPrinter(int sNumber) {
		remainingCartridge = 100;
	}
	
	public int getRemainingCartridge() {
		return remainingCartridge;
	}

	@Override
	public void print() {
		if(remainingCartridge > 0) {
			remainingCartridge -= 10;
			System.out.println("InkjetPrinter is printing. Remaining Cartridge: " + remainingCartridge + "%");
		} else if(remainingCartridge == 0) {
			System.out.println("Cartridge is empty");
		}
	}
}
