package app;


public class Trapeze extends QGon {
	public Trapeze(Point2D[] p) throws Exception {
		super(p);
		type = "Trapeze";
	}

	@Override
	public double square() throws Exception {
		return super.square();
	}


	@Override
	public String toString() {
		return type + super.toString().substring(4);
	}
}
