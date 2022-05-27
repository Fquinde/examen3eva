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
	 * post:
	 */
	private static void leerarchivo(String fichero) {
		File file= new File(fichero);
		String letra = "ñ";
		int linealetra=0;
		try {
			Scanner f =  new Scanner(file);
			linealetra=1;
			while(f.hasNextLine()) {
				String linea= f.nextLine();
				String[] lineaSep = linea.split(" ");
				for(int x=0; x<linea.length(); x++) {
					if(lineaSep[x].contains(letra)) {
						System.out.println   (  "linea:" +  linealetra + " palabras:" + lineaSep[x]);
					}
					linealetra++;
				}
			}
			f.close();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
	}
}
