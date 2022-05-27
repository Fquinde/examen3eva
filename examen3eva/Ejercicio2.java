package examen3eva;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		leerarchivo("C:\\Users\\quind\\Downloads\\Divorcios.csv");
	}


	private static void leerarchivo(String fichero) {
		ArrayList<String> lista = new ArrayList<String>();
		File file= new File(fichero);
		int separacion=0;
		int sinseparacion=0;
		int albacete=0;
		int alicante=0;
		int Araba=0;
		int avila=0;
		int almeria=0;
		int asturias=0;
		int badajoz=0;
		int balears=0;
		String fecha="2019";
		String fecha2="2018";
		String palabra ="si";
		String palabra2 ="no";
		try {
			Scanner f =  new Scanner(file);
			separacion=0;
			while(f.hasNextLine()) {
				String linea= f.nextLine();
				String[] lineaSep = linea.split(";");
				if(lineaSep[2].equalsIgnoreCase(fecha)) {
					if(lineaSep[1].equalsIgnoreCase(palabra)) {
						separacion++;
					}
				}
				if(lineaSep[2].equalsIgnoreCase(fecha2)) {
					if(lineaSep[1].equalsIgnoreCase(palabra2)) {
						sinseparacion++;
					}
				}
				if(lineaSep[0].contains("Albacete")) {
					albacete++;
					
				}else if(lineaSep[0].contains("Alicante")) {
					alicante++;
				}else if(lineaSep[0].contains("Almería")) {
					almeria++;
				}else if(lineaSep[0].contains("Araba")) {
					Araba++;
				}else if(lineaSep[0].contains("Asturias")) {
					asturias++;
				}else if(lineaSep[0].contains("Ávila")) {
					avila++;
				}else if(lineaSep[0].contains("Badajoz")) {
					badajoz++;
				}else if(lineaSep[0].contains("Balears")) {
					balears++;
				}
			}
			System.out.println("CON separación previa en el año 2019: " + separacion);
			System.out.println("SIN separación previa en el año 2018: " + sinseparacion);
			System.out.println( "albacete: " + albacete);
			System.out.println("Alicante: " + alicante);
			System.out.println("Almería:" + almeria);
			System.out.println("Araba:" + Araba);
			System.out.println("Asturias:" + asturias);
			System.out.println("Ávila:" + avila);
			System.out.println("Badajoz:" + badajoz);
			System.out.println("Balears" + balears);
			f.close();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
	}

}
