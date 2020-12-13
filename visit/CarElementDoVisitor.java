package visit;

public class CarElementDoVisitor implements CarElementVisitor {

	@Override
	public void visit(Wheel wheel) {
		// TODO Auto-generated method stub
		System.out.println("Kicking my " + wheel.getName());

	}

	@Override
	public void visit(Engine engine) {
		// TODO Auto-generated method stub
		System.out.println("Starting my engine");

	}

	@Override
	public void visit(Body body) {
		// TODO Auto-generated method stub
		System.out.println("Moving my body");

	}

	@Override
	public void visitCar(Car car) {
		// TODO Auto-generated method stub
		System.out.println("\nStarting my car");
		for (CarElement carElement : car.getElements()) {
			carElement.accept(this);
		}
		System.out.println("Started car");

	}

}
