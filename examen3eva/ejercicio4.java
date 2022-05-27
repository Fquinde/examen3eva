package examen3eva;

public class ejercicio4 {
	public static void main(String[] args) {
		multiplicar(0, 0);
		
	}

	public static int multiplicar (int n, int x) {
		if(x<=49) {
			System.out.println(x + " " + "= " + n*2);
			return(multiplicar( x +1, n));
		}
		return n;
	}
}
