package excepciones;

public class CirculoException extends RuntimeException {
	private static final long serialVersionUID = -3842571313197329286L;

	public CirculoException(Exception e) {
		super(e);
	}
}
