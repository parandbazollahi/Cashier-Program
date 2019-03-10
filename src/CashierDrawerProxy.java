/**
 * this class use as a proxy pattern and return a balance and drawerState
 * @author Parand.bazollahi
 */
public class CashierDrawerProxy implements GetDrawerData {

	public DrawerState getDrawerState() {
		CashierDrawer cashDrawer = new CashierDrawer();
		return cashDrawer.getDrawerState();
	}
	
	public void showBalance(double balance) {
		System.out.print("Your total balance is: "  + balance);
	}
}