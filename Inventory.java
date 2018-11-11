import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Inventory {
	public int i; // This int is responsible for ticking up through the Stock Array as new items are added with the addStock method

	public String Stock[][] = new String[50][2]; // The array to hold ÍDs & Product Names

	public void loadStock() {
		String getStock = "";
		for (int x = 0; x < Stock.length; x++) {
			getStock = getStock + Stock[x][0] + "\t" + Stock[x][1] + "\n";

		}

		JScrollPane scrollPane = new JScrollPane(new JLabel(getStock));
		scrollPane.setPreferredSize(new Dimension(300, 100));
		Object message = scrollPane;
		JTextArea textArea = new JTextArea(getStock);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setMargin(new Insets(5, 5, 5, 5));
		scrollPane.getViewport().setView(textArea);
		message = scrollPane;
		JOptionPane.showMessageDialog(null, message);

	}

	public void addStock(String ID, String productName) {
	
		for (int x = 0; x < Stock.length; x++) {
			if (ID.equals(Stock[x][0]) ) {
				JOptionPane.showMessageDialog(null, "A product with this ID already exists, please use another.");
				return;
			}

	
		}
		Stock[i][0] = ID;

		Stock[i][1] = productName;

		i++;

	}

	public void modStock(String ID, String newProduct) {
		for (int x = 0; x < Stock.length; x++) { 
			if ((Stock[x][0].equals(ID))) {
				Stock[x][1] = newProduct;
				return;

			} 

		}	

	}
	public String findStock(String ID) {
		String found = null;
		for (int z = 0; z < Stock.length; z++) {
			if (ID.equals(Stock[z][0])) {
				found = Stock[z][1];
				break;
			} 
		}
		if (found == null){
			JOptionPane.showMessageDialog(null, "Couldn't find product with ID :" + ID);
		}
		JOptionPane.showMessageDialog(null, "Product " + ID + " is : " + found);
		System.out.println(found);
		return found;
	}

}
