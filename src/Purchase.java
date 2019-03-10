/**
 * use command pattern for purchasing item 
 * @author Parand.bazollahi
 */
public class Purchase implements Command {
	
		   private Cashier customer;

		   public Purchase(Cashier customer){
		      this.customer = customer;
		   }

		   public void execute() {
			   customer.AskForPurchase();
		   }
		}