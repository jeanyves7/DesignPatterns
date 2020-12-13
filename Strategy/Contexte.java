package Strategy;

public class Contexte {

	private strategy strat;
	
	public Contexte(strategy strat) {
		this.strat=strat;
	}
	
	public int executeStrategy(int num1,int num2) {
		return strat.doOperation(num1, num2);
	}
	
}
