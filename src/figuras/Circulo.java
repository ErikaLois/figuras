package figuras;

public class Circulo extends Figuras{
	
	double radio;
	
	public double superficie() {
		
		/*
		 PRECONDICIONES: El radio debe ser un número positivo.
		 POSCONDICIONES: Devuelve el tamaño de la superficie del círculo.
		 */
		
		double superficie = Math.PI * Math.pow(radio, 2.0);
		
		return superficie;
	};
	
	public void mostrar() {
		
		/*
		 PRECONDICIONES: El radio y la superficie deben ser números positivos.
		 POSCONDICIONES: Devuelve un string con los datos del radio y la superficie. 
		 */
		
		String frase = "El círculo tiene un radio de: " + radio + " y una superficie de: " + superficie();
		
		System.out.println(frase);
	}
	
}
