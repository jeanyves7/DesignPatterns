package Strategy;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contexte context = new Contexte(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Contexte(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Contexte(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
