package excepciones;

public class RadioNegativoException extends RuntimeException {
	private static final long serialVersionUID = -1582226803976856833L;

	public RadioNegativoException(String mensaje) {
		super(mensaje);
	}

	public RadioNegativoException() {
		super("Mi mensaje");
	}
}
