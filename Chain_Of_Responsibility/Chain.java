package Chain_Of_Responsibility;

public interface Chain {

	public void setNextChain(Chain nextChain);
	
	public void calculate(Numbers request);
}
