package figuras;

public class Rectangulo extends Figuras {

	double base;
	
	double altura;
	
	public double superficie() {
		
		/*
		 PRECONDICIONES: El tamaño de la base y de la altura deben ser números positivos.
		 POSCONDICIONES: Devuelve el tamaño de la superficie del rectángulo.
		 */
		
		double superficie = base * altura;
		
		return superficie;
	};
	
	public void mostrar() {
		
		/*
		 PRECONDICIONES: El tamaño de la base y de la altura deben ser números positivos.
		 POSCONDICIONES: Devuelve un string con los datos de la base, la altura y la superficie.
		 */
		
		String frase = "El triángulo tiene una base de: " + base + ", una altura de: " + altura + " y una superficie de: " + superficie();
		
		System.out.println(frase);
	}
	
}
