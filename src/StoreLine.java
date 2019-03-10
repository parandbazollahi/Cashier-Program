/**
 * use State pattern for line check
 * @author Parand.bazollahi
 */
public class StoreLine {
	   private State state;

	   public StoreLine(){
	      state = null;
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
	}