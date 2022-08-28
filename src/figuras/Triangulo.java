package figuras;

public class Triangulo extends Figuras {
	
	double base;
	
	double altura;
	
	public double superficie() {
		double superficie = (base * altura) / 2;
		return superficie;
	};
	
	public String mostrar() {
		String frase = "El triángulo tiene una base de: " + base + ", una altura de: " + altura + " y una superficie de: " + superficie();
		return frase;
	}
	

}
