package figuras;
import java.lang.Math.*;

public class Circulo extends Figuras{
	
	double radio;
	
	public double superficie() {
		double superficie = Math.PI * Math.pow(radio, 2.0);
		return superficie;
	};
	
	public String mostrar() {
		String frase = "El círculo tiene un radio de: " + radio + " y una superficie de: " + superficie();
		return frase;
	}
	
}
