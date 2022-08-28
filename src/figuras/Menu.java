package figuras;

import java.util.Arrays;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Random;

public class Menu {
	
	Random rand = new Random();
	
	int tamanio = rand.nextInt(11);
	
	List<String>  tipoFiguras = Arrays.asList("Círculo", "Triángulo", "Rectangulo");
			
	Figuras vectorFiguras[];
	
	
	public void cargarVector() {
		
		/* 
		 * PRECONDICIONES: EL tamaño del vector debe ser mayor a cero.
		 * POSTCONDICIONES: Se carga el vector "vectorFiguras" conn información aleatoria. Las figuras solo serán:
		 * círculos, triángulos o rectángulos. 
		 */
		
		Figuras vectorAuxiliar[] = new Figuras[tamanio];
				
		for (int i = 0; i < vectorAuxiliar.length ; i++) {
			
			switch (tipoFiguras.get(rand.nextInt(tipoFiguras.size()))) {
			
			case "Círculo":
				
				Circulo circulo = new Circulo();
				
				circulo.radio = (rand.nextDouble() + rand.nextInt(10));
						
				vectorAuxiliar[i] = circulo;
			
			case "Triángulo":
				
				Triangulo triangulo = new Triangulo();
				
				triangulo.base = (rand.nextDouble() + rand.nextInt(10));
				
				triangulo.altura = (rand.nextDouble() + rand.nextInt(10));
				
				vectorAuxiliar[i] = triangulo;
				
			case "Rectangulo":
				
				Rectangulo rectangulo = new Rectangulo();
				
				rectangulo.base = (rand.nextDouble() + rand.nextInt(10));
				
				rectangulo.altura = (rand.nextDouble() + rand.nextInt(10));
				
				vectorAuxiliar[i] = rectangulo;	
				
			}
			
		}
		
		vectorFiguras = vectorAuxiliar;
	}
	
	public void objetoEnPosicion(int pos) {
		
		/*
		 PRECONDICIONES: La posición que se pasa por parámetro debe ser un número válido entre 0 y
		 el tamaño del vector -1.
		 POSTCONDICIONES: Imprime en pantalla el objeto que se encuentra en la posición pasada por parámetro
		 junto con los datos de sus atributos y superficie. 
		 */
		
		Figuras objeto = vectorFiguras[pos];
		
		objeto.mostrar();
		
	}
	
	public void darDeBajaElemento(int pos) {
		
		/*
		 PRECONDICIONES: La posición que se pasa por parámetro debe ser un número válido entre 0 y
		 el tamaño del vector -1.
		 POSTCONDICIONES: Elimina el objeto que se encuentra en la posición dada por parámetro y deja el espacio
		 vacío.
		 */
		
		vectorFiguras[pos] = null;
		
	}
	
	public boolean hayEspacio() {
		
		/*
		 *  PRECONDICIONES: El vector debe tener un tamaño mayor a cero. 
		 *  POSTCONDICIONES: Devuelve true si hay algún lugar vacío en el vector y false en caso contrario.
		 */
		
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
		
		/*
		 * PRECONDICIONES: La figura a ingresar debe ser válida (círculo, triángulo o rectángulo).
		 * POSTCONDICIONES: En caso de que haya algún espacio vacío en el vector, agrega la figura dada
		 * por parámetro. En caso contrario, se crea un nuevo vector con los datos del original más un
		 * espacio vacío para el nuevo elemento. Se asigna este vector auxiliar como el nuevo vectorFiguras. 
		 * */
		
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
			
			vectorFiguras = vectorFigurasNuevo;	
		} 
		
	}
	
	public void listarElementos() {
		
		/*
		 * PRECONDICIONES: El tamaño del vector debe ser mayor a cero.
		 * POSTCONDICIONES: Se imprime en pantalla los datos de las figuras que componen el vector. 
		 */
		
		for(int i = 0; i < vectorFiguras.length ; i++) {
			
			if (vectorFiguras[i] != null) {
				
				vectorFiguras[i].mostrar();
				
			} else {
				
				System.out.println("vacío");
			}
			
		}
	} 
		
	
	public void superficieMaxima() {
		
		/*
		 * PRECONDICIONES: El vector debe tener una superficie mayor a cero. 
		 * POSTCONDICIONES: Devuelve cual es la superficie máxima entre todos los elementos del vector. 
		 */
		double max = vectorFiguras[0].superficie();
		
		for(int i = 0; i < vectorFiguras.length; i++ ) {
			
			if (max < vectorFiguras[i].superficie()) {
				
				max = vectorFiguras[i].superficie();
			}
		}
		System.out.println(max);
	}
		
	
	public void superficieMinima() {
		
		/*
		 * PRECONDICIONES: El vector debe tener una superficie mayor a cero. 
		 * POSTCONDICIONES: Devuelve cual es la superficie mínima entre todos los elementos del vector. 
		 */
		
		double min = vectorFiguras[0].superficie();
		
		for(int i = 0; i < vectorFiguras.length; i++ ) {
			
			if (min > vectorFiguras[i].superficie()) {
				
				min = vectorFiguras[i].superficie();
			}
		}
		System.out.println(min);
	}

	
	
}
