/**
 * use state pattern for showing if No customer in the line 
 * @author Parand.bazollahi
 */
public class NoLineState implements State {
	StoreLine storeLine;

	public void Line(StoreLine storeLine) {
		System.out.println("\nNo custome in the line");
		storeLine.setState(this);
	}

	public String toString() {
		return "No line";
	}

}