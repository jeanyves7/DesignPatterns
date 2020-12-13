package Chain_Of_Responsibility;

public class AddNumbers implements Chain {

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		// TODO Auto-generated method stub
		this.nextInChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		// TODO Auto-generated method stub

		if (request.getCalcWanted() == "add") {
			System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = "
					+ (request.getNumber1() + request.getNumber2()));

		} else {

			nextInChain.calculate(request);

		}
	}

}
