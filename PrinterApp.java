package lab8_printer;

public class PrinterApp {

	public static void main(String[] args) {
		InkjetPrinter ink = new InkjetPrinter(1234567);
		System.out.println(ink);
		System.out.println("Remaining Cartridge: " + ink.getRemainingCartridge() + "%\n");
		
		LaserPrinter laser = new LaserPrinter(2345678);
		System.out.println(laser);
		System.out.println("Remaining Toner: " + laser.getRemainingToner() + "%");
		
		System.out.println("List of Printers: ");
	}

}
