package examen3eva;

public class ejercicio4 {
	/**
	 * pree:--
	 * post: le paso los parametros para hacer la recursiva le envio la posicion cero y el numero que quiero multiplicar
	 */
	public static void main(String[] args) {
		multiplicar(0, 2);
		
	}
	/**
	 * pree:--
	 * post: recibe los parametros y hago un if que me muestre hasta el numero 100 y en el if adentro del sysout le doy la 
	 * 		posicion y por el numero y llamo al metodo a cada rato para que me lo vaya multiplicando.
	 */
	public static int multiplicar (int i, int n) {
		if(i<=100) {
			System.out.println(i + "*"+  n + "=" + i*n + "\n");
			multiplicar(i + 1 , n);
		}
		return n;
	}
}
