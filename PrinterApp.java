package lab8_printer;

import java.util.ArrayList;

public class PrinterApp {

	public static void main(String[] args) {
		InkjetPrinter ink = new InkjetPrinter(1234567);
		System.out.println(ink);
		System.out.println("Remaining Cartridge: " + ink.getRemainingCartridge() + "%\n");
		
		LaserPrinter laser = new LaserPrinter(2345678);
		System.out.println(laser);
		System.out.println("Remaining Toner: " + laser.getRemainingToner() + "%\n");
		
		System.out.println("List of Printers: ");
		ArrayList<Printer> printers = new ArrayList<>();
		printers.add(ink);
		printers.add(laser);
		
		for(Printer p : printers) {
			System.out.println(p);
			for(int i = 0; i < 11; i++) {
				p.print();
			}
			System.out.println();
		}
	}

}
