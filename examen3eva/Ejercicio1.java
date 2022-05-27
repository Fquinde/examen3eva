package examen3eva;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		leerarchivo("C:\\Users\\quind\\Downloads\\HablanosDelDon.txt");
	}
	
	/**
	 * pree:--
	 * post:En este metodo recibo la ruta lo paso a un file creo un escaner para poderlo leer le digo que letra quiero buscar,
	 * 		me saca las lineas en donde se encuentra esa palabra pero no se sacar la palabra en si es lo que me falta.
	 */
	private static void leerarchivo(String fichero) {
		File file= new File(fichero);
		String letra = "z";
		int linealetra=0;
		try {
			Scanner f =  new Scanner(file);
			linealetra=1;
			while(f.hasNextLine()) {
				String linea= f.nextLine();
				String[] lineaSep = linea.split(" ");
				if(linea.contains(letra)) {
					System.out.println("Linea:" + linealetra + ":" + linea);
				}linealetra++;
			}
			f.close();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
	}
}
