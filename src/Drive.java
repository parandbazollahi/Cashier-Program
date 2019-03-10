
/**
 * This class for test the program
 * @author Parand.bazollahi
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Drive {
	public static void main(String[] args) {

		HomeItem homeItem = new HomeItem();
		ClotheItems clotheItem = new ClotheItems();

		ArrayList<StoreItem> homeItems = homeItem.getHomesItems();
		ArrayList<StoreItem> clotheItems = clotheItem.getClothingItems();
		// make Queue to put all customers in that
		// give each customer random items
		Queue<Customer> customers = new LinkedList<Customer>();
		for (int k = 0; k < 6; k++) {
			Customer customer = new Customer();
			customer.totalCash = 2000.00;
			Random random = new Random();
			for (int i = 0; i < 5; i++) {
				StoreItem item = homeItems.get(random.nextInt(14));
				item.quantity = random.nextInt(6 - 1) + 1;
				customer.addItem(item);
			}
			for (int j = 0; j < 5; j++) {
				StoreItem item = clotheItems.get(random.nextInt(20));
				item.quantity = random.nextInt(6 - 1) + 1;
				customer.addItem(item);
			}
			customers.add(customer);
		}

		// checking store line
		StoreLine storeLine = new StoreLine();
		NoLineState Noline = new NoLineState();
		HasLineState hasline = new HasLineState();

		Scanner scanner = new Scanner(System.in);
		Cashier cashier = new Cashier();
		// take out each customer in the list to cashier
		while (!customers.isEmpty()) {

			if (customers.size() <= 0) {
				Noline.Line(storeLine);
			} else {
				hasline.Line(storeLine);
			}
			Customer customer = pop(customers);
			cashier.callCustomer(customer);
			Purchase purchase = new Purchase(cashier);
			Return returnItem = new Return(cashier);
			System.out.println("");
			System.out.println("\nHi, How are you?");
			System.out.println("Do you have return or purchase?");
			String input = scanner.nextLine();
			// test for purchase
			if (input.equals("purchase")) {
				cashier.servingCustomer.Order(purchase);
				cashier.servingCustomer.GiveOrder();
				System.out.println();
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				// get current date time with Calendar()
				Calendar cal = Calendar.getInstance();
				System.out.println(dateFormat.format(cal.getTime()));
				System.out.println();

				cashier.performPurchase(cashier.servingCustomer.itemList);
				System.out.println();

				CashierDrawerProxy cashierDrawerProxy = new CashierDrawerProxy();
				cashierDrawerProxy.getDrawerState();
				cashierDrawerProxy.showBalance(cashier.servingCustomer.balance);
				CashierDrawer cashierDrawer = new CashierDrawer();

				cashierDrawer.getAskForMoneyState();
				System.out.println(cashierDrawer.askForMoney());

				double cash = customer.GiveMoney(cashier.servingCustomer.balance);
				System.out.println("\nCustomer Pay : " + cash);
				// return money and showing a change
				int change = (int) (Math.ceil((cash - cashier.servingCustomer.balance) * 100));
				System.out.println("\nTotal amount of change to give: " + (cash - cashier.servingCustomer.balance));

				int dollars = Math.round((int) change / 100);
				change = change % 100;
				int quarters = Math.round((int) change / 25);
				change = change % 25;
				int dimes = Math.round((int) change / 10);
				change = change % 10;
				int nickels = Math.round((int) change / 5);
				change = change % 5;
				int pennies = Math.round((int) change / 1);

				System.out.println("Dollars: " + dollars);
				System.out.println("Quarters: " + quarters);
				System.out.println("Dimes: " + dimes);
				System.out.println("Nickels: " + nickels);
				System.out.println("Pennies: " + pennies);

				double totalCashinDarwer = cashierDrawer.getCashInDrawer() + cash;
				cashierDrawer.updateCashInDrawer(totalCashinDarwer);
				cashierDrawer.getReturnMoneyState();
				System.out.println(cashierDrawer.returnMoney());
				cashierDrawer.endPurchase();

				// test for return
			} else if (input.equals("return")) {
				cashier.servingCustomer.Order(returnItem);
				cashier.servingCustomer.GiveOrder();
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				// get current date time with Calendar()
				Calendar cal = Calendar.getInstance();
				System.out.println(dateFormat.format(cal.getTime()));
				
				// proxy pattern for cashier drawer which has not shows to customers 
				cashier.performPurchase(cashier.servingCustomer.itemList);
				CashierDrawerProxy cashierDrawerProxy = new CashierDrawerProxy();
				cashierDrawerProxy.showBalance(cashier.servingCustomer.balance);
				//print change which has to return to customer
				int change = (int) (Math.ceil((cashier.servingCustomer.balance) * 100));
				System.out.println("\nTotal amount of change to give: " + cashier.servingCustomer.balance);

				int dollars = Math.round((int) change / 100);
				change = change % 100;
				int quarters = Math.round((int) change / 25);
				change = change % 25;
				int dimes = Math.round((int) change / 10);
				change = change % 10;
				int nickels = Math.round((int) change / 5);
				change = change % 5;
				int pennies = Math.round((int) change / 1);

				System.out.println("Dollars: " + dollars);
				System.out.println("Quarters: " + quarters);
				System.out.println("Dimes: " + dimes);
				System.out.println("Nickels: " + nickels);
				System.out.println("Pennies: " + pennies);

				CashierDrawer cashierDrawer = new CashierDrawer();
				cashierDrawer.getReturnMoneyState();
				System.out.println(cashierDrawer.returnMoney());

				double cash = customer.GiveMoney(cashier.servingCustomer.balance);
				double totalCashinDarwer = cashierDrawer.getCashInDrawer() + cash;
				cashierDrawer.updateCashInDrawer(totalCashinDarwer);

				cashierDrawer.endPurchase();

				// get error input
			} else {
				System.out.println("Invalid!");
			}

		}

	}
	//method to get customer in queue each time cashier calls
	public static Customer pop(Queue<Customer> customers) {
		return customers.remove();
	}

}
