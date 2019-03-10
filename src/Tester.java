/**
 * use Junit test
 * @author Parand.bazollahi
 */
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Tester {

	@Test
	public void test_SetMoneyAndGivemoney() {
		Customer customer = new Customer();
		customer.SetMoney(1000);
		customer.GiveMoney(250.00);
		double remainingCash = customer.TotalCash();
		Assert.assertEquals(750.00, remainingCash);
	}

	@Test
	public void test_performPurchase() {
		HomeItem homeItem = new HomeItem();
		Customer customer = new Customer();
		Cashier cashier = new Cashier();
		cashier.callCustomer(customer);
		cashier.performPurchase(homeItem.storeItems);
		double balance = cashier.servingCustomer.balance;
		Assert.assertEquals(27647.289999999997, balance);
	}
	

}
