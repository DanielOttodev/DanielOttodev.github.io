import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		FileHandler myFiles = new FileHandler();
		Main Mainapp = new Main();
		Inventory myInventory = new Inventory(); // Created a object of the class Inventory so it can be called upon within the Main class.
		
		

		boolean flag = true;
		
	JOptionPane.showMessageDialog(null, "Ok to proceed to Canteen Stock Management");
	while (flag == true) {
		
	
	int input = Integer.parseInt(JOptionPane.showInputDialog("Canteen Stock Management\n 1. View Inventory \n 2. Add new product \n 3. Edit product \n 4. Search for a product \n 5.Add items from file(.txt)  0. Exit"));
	 if (input == 1) {
		 myInventory.loadStock(); // Call upon loadStock method from the Inventory class using the myInventory object
		 
	 }
	 else if (input == 2) {
		String ID = JOptionPane.showInputDialog("Give this product a unique ID:" );
		String productName = JOptionPane.showInputDialog("Enter product name to add: ");
		
		myInventory.addStock( ID, productName);// Call upon addStock method from the Inventory class using the myInventory object - This method adds new items to the array which holds ID's & Product Names
											   // Disallows duplicate ID's.					
		
	}
	else if (input == 3) {
		String ID = JOptionPane.showInputDialog("What is the ID of the item you want to change?:" );
		String newProduct = JOptionPane.showInputDialog("What is the new product name?:" );
		myInventory.modStock(ID, newProduct);	/* Call upon modStock method from the Inventory class using the myInventory object - This method allows for editing of items within the Stock array
												with a validator to handle exception of an invalid ID number*/ 
	}
	
	
	else if (input == 4) {
		String ID = JOptionPane.showInputDialog("What is the ID of the item you want to find?:" );
		myInventory.findStock(ID);                      // Call upon findStock method - Loops through array to match input with ID & retrieve product name.
		
	}
	
	else if (input == 5) {
		myFiles.openFile();
		myFiles.readFile();
		myFiles.shutFile();
	}
	 
	 
	else if (input == 0) {
		flag = false;
		
	}
	else {
		
	}
	
	}
}

}
