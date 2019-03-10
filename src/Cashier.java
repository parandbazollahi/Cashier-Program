/**
 * class cashier which have customer and ask for return and purchase, also get balancea and print them
 * @author Parand.bazollahi
 */
import java.util.Queue;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Cashier {
	Customer servingCustomer;
	private double amountDue;
	private double amountReceived;
	private double change;

	// Method for calling customer that have one customer each time
	public void callCustomer(Customer customer) {
		servingCustomer = customer;
	}
	//Method for asking a customer for return 
	public void AskForReturn() {
		System.out.println("Doing return ");
	}
	//Method for asking a customer for purchase 
	public void AskForPurchase() {
		System.out.println("Doing purchase ");
	}
	//Method which get a list of item in storeItem and return a balance for each customer,also printing a bill
	public void performPurchase(ArrayList<StoreItem> itemList) {
		 //System.out.println(String.format("%25s %20s %5s %20s %5s", "Item", "|", "Price($)", "|", "Qty"));

		System.out.format("%-19s |","Item");
		System.out.format("%-5s|","Price $");
		System.out.format("%-4s  |", "Qty");
		System.out.format("%n");
		System.out.format("------------------------------------ %n");
		for (int i = 0; i < itemList.size(); i++) {
			//System.out.format("%-19s | %-5s | %-3s |%n", itemList.get(i).name, itemList.get(i).price, itemList.get(i).quantity);
			System.out.format("%-19s |",itemList.get(i).name );
			System.out.format("%-5s  |",itemList.get(i).price );
			System.out.format("%-4s  |",itemList.get(i).quantity);
			System.out.println();
			servingCustomer.balance += itemList.get(i).price * itemList.get(i).quantity;

		}
		
	}

}
