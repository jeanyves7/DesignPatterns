package visit;

public class TestVisitorDemo {
	public static void main(String[] args) {
		Car car = new Car();

		CarElementVisitor printVisitor = new CarElementPrintVisitor();
		CarElementVisitor doVisitor = new CarElementDoVisitor();

		printVisitor.visitCar(car);
		doVisitor.visitCar(car);
	}
}
