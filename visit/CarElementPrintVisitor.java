package visit;

public class CarElementPrintVisitor implements CarElementVisitor {

	@Override
	public void visit(Wheel wheel) {
		// TODO Auto-generated method stub
		System.out.println("Visiting " + wheel.getName() + " wheel");

	}

	@Override
	public void visit(Engine engine) {
		// TODO Auto-generated method stub
		System.out.println("Visiting engine");

	}

	@Override
	public void visit(Body body) {
		// TODO Auto-generated method stub
		System.out.println("Visiting body");
	}

	@Override
	public void visitCar(Car car) {
		// TODO Auto-generated method stub
		System.out.println("\nVisiting car");
		for (CarElement element : car.getElements()) {
			element.accept(this);
		}
		System.out.println("Visited car");
	}

}
