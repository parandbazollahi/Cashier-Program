/**
 * use state pattern for showing if customer in the line 
 * @author Parand.bazollahi
 */
public class HasLineState implements State {
	StoreLine storeLine;

	public void Line(StoreLine storeLine) {
		System.out.println("\nCustomer in the line");
		storeLine.setState(this);
	}

	public String toString() {
		return "line state";
	}

	
}