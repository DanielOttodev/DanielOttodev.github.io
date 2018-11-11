import java.io.File;
import java.util.Scanner;

public class FileHandler {
	private Scanner x;
	Inventory myInventory = new Inventory();
	
	public void openFile() {
		try {
			x = new Scanner (new File ("NewItems.txt"));
			
		}
		catch(Exception e) {
			System.out.println("Couldn't open file");
		}
	}
	public void readFile() {
		while(x.hasNext()) {
			
		String a = x.next();
		String b = x.next();
		System.out.printf("%s %s ",a,b);
		
		}
	}

	public void shutFile() {
		x.close();
		
	}
	public void saveFile() {
	
	}
}
