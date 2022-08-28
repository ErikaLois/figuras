package figuras;

public class Main {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		
		menu.cargarVector();
		
		System.out.println("El vector contiene los siguientes elementos:");
		
		menu.listarElementos();
		
		System.out.println("El elemento en posición 2 es: ");
		
		menu.objetoEnPosicion(2);
		
		Circulo circulo1 = new Circulo();
		
		circulo1.radio = 1.50;
		
		menu.agregarElemento(circulo1);
		
		System.out.println("Luego de agregar el círculo, el vector contiene los siguientes elementos:");
		
		menu.listarElementos();
		
		System.out.println("La superficie máxima es:");
		
		menu.superficieMaxima();
		
		System.out.println("La superficie minima es:");
		
		menu.superficieMinima();
	}
}
