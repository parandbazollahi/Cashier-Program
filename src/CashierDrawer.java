/**
 * @author Parand.bazollahi
 * this class use the proxy pattern also can return a money in cashier drawer which has not shown to customer  
 */
public class CashierDrawer implements GetDrawerData{
	private DrawerState drawerState;
	private double cashInDrawer = 2000;
	private DrawerState askCash;
	private DrawerState returnCash;
	
	public String askForMoney() { return "\nPlease give your money"; }
	public String returnMoney() { return "\nPlease accept your money"; }
	public void endPurchase() { System.out.println("\nThanks for shopping in our store"); }
	
	public DrawerState getAskForMoneyState() { return askCash; }
	public DrawerState getReturnMoneyState() { return returnCash; }
	
	public DrawerState getDrawerState() { return drawerState; }
	public double getCashInDrawer() { return cashInDrawer; }
	public void updateCashInDrawer(double newTotalCash ) { cashInDrawer = newTotalCash; }
	
	public void showBalance(double balance) {
		System.out.print("Your total balance is: "  + balance);
	}
} 