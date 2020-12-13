package visit;

public class Engine implements CarElement {

	@Override
	public void accept(CarElementVisitor visitor) {
		// TODO Auto-generated method stu
		        visitor.visit(this);
		    
	}

}
