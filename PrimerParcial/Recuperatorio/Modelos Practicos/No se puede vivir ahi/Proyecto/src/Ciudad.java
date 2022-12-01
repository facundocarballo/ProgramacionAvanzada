
public class Ciudad {

	private int max, min;
	protected int id, hostilidad, no_comparaciones;
	
	public Ciudad(int max, int min, int id) {
		this.max = max;
		this.min = min;
		this.id = id;
		this.hostilidad = 0;
		this.no_comparaciones = 0;
	}
	
	public Ciudad(int id) {
		this.max = 0;
		this.min = 0;
		this.id = id;
		this.hostilidad = 0;
		this.no_comparaciones = 0;
	}
	
	public void trySetMax(int m) {
		if (m > this.max) {
			this.max = m;
		}
	}
	
	public void trySetMin(int m) {
		if (m < this.min) {
			this.min = m;
		}
	}
	
	public int getMax() {
		return this.max;
	}
	
	public int getMin() {
		return this.min;
	}
	
}
