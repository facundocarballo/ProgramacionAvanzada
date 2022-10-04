import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundFig implements Figura{
	protected List<Figura> children = new ArrayList<>();
	
	public CompoundFig(Figura... componentes){
		add(componentes);
	}
	
	public void add(Figura... componentes) {
		children.addAll(Arrays.asList(componentes));
	}
	
	public void add(Figura componente) {
		children.add(componente);
	}
	
	@Override
	public double getArea() {
		double suma = 0;
		
		for (Figura figura : children) {
			suma += figura.getArea();
		}
		
		return suma;
	}
	
}
