package figuras;

import java.util.Arrays;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Random;

public class Menu {
	
	Random rand = new Random();
	
	int tamanio = rand.nextInt(11);
	
	List<String>  tipoFiguras = Arrays.asList("Círculo", "Triángulo", "Rectangulo");
			
	Figuras vectorFiguras[] = new Figuras[tamanio];
	
	public void cargarVector() {
		
		for (int i = 0; i < vectorFiguras.length ; i++) {
			
			switch (tipoFiguras.get(rand.nextInt(tipoFiguras.size()))) {
			
			case "Círculo":
				
				Circulo circulo = new Circulo();
				
				circulo.radio = rand.nextDouble();
						
				vectorFiguras[i] = circulo;
			
			case "Triángulo":
				
				Triangulo triangulo = new Triangulo();
				
				triangulo.base = rand.nextDouble();
				
				triangulo.altura = rand.nextDouble();
				
				vectorFiguras[i] = triangulo;
				
			case "Rectangulo":
				
				Rectangulo rectangulo = new Rectangulo();
				
				rectangulo.base = rand.nextDouble();
				
				rectangulo.altura = rand.nextDouble();
				
				vectorFiguras[i] = rectangulo;	
				
			}
			
		}
	}
	
	public String objetoEnPosicion(int pos) {
		
		Figuras objeto = vectorFiguras[pos];
		
		return objeto.mostrar();
		
	}
	
	public void darDeBajaElemento(int pos) {
		
		vectorFiguras[pos] = null;
		
	}
	
	public boolean hayEspacio() {
		
		boolean espacio = false;
		
		int i = 0;
		
		while (espacio) {
			
			Object figura = Array.get(vectorFiguras, i); 
			
			if (figura == null) {
				
				espacio = true;
				
			}
			
			i++;
			
		}
		
		Object figura = Array.get(vectorFiguras, i);
		
		if (figura == null) {
			
			espacio = true;
			
		}
		
		return espacio;
		
	}
	
	public void agregarElemento(Figuras elemento) {
		
		if(hayEspacio()) {
			
			int i = 0;
			
			while (!hayEspacio()) {
				
				i++;
				
			}
			
			vectorFiguras[i] = elemento;
			
		} else {
			
			Figuras vectorFigurasNuevo[] = new Figuras[vectorFiguras.length + 1];
			
			for (int i = 0; i < vectorFiguras.length ; i++) {
				
				vectorFigurasNuevo[i] = vectorFiguras[i];
			}
			
			vectorFigurasNuevo[vectorFigurasNuevo.length-1] = elemento;
		} 
		
			
	}
	
	public String listarElementos(Figuras[] vector) {
		
		for(i = 0; i < vector.length; i++) {
			
			
		}
	} 
		
		
		
			
	public static void main(String[] args) {
		
	};
	
	
}
