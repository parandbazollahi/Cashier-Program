/**
 * Interface for proxy pattern which has a varible that can shows to customers
 * @author Parand.bazollahi
 */
public interface DrawerState {
	String askForMoney();
	String returnMoney();
	void showBalance(double balance);
	void endPurchase();
}