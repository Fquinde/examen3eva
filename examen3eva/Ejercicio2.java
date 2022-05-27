package examen3eva;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		leerarchivo("C:\\Users\\quind\\Downloads\\Divorcios.csv");
	}

	private static void leerarchivo(String fichero) {
		File file= new File(fichero);
		int linealetra=0;
		try {
			Scanner f =  new Scanner(file);
			linealetra=1;
			while(f.hasNextLine()) {
				String linea= f.nextLine();
				linea = linea.replaceAll(" ",";");
				String[] lineaSep = linea.split(";");
				System.out.println(linea);
			}
			f.close();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
	}

}
