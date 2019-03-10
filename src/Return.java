/**
 * use command pattern for returning item 
 * @author Parand.bazollahi
 */
public class Return implements Command {
	   private Cashier customer;

	   public Return(Cashier customer){
	      this.customer = customer;
	   }

	   public void execute() {
		   customer.AskForReturn();
	   }
	   
	}

