package recursividad;
/**
 * Implementa un programa Java que dada una tabla multidimensional de números enteros, muestre todos los sus elementos por pantalla de forma recursiva.
 */

public class Ejercicio5 {
	/**
	 * Pre:---
	 * Post:
	 */
	public static void main (String[] args) {
		int [][] t = {{1,2,3,4},{5,6,7,8}};
	}
	public static void mostrarRecursivo (int[][] t) {
		mostrarRecursivo (t, 0, 0);
	}
	public static void mostrarRecursivo (int[][] t, int i, int j) {
		if( i < t.length && j == t[i].length) {
			System.out.println();
			mostrarRecursivo(t, i+1,0);
		} else if (i<t.length) {
			System.out.println(t[i][j] + " ");
			mostrarRecursivo(t, i,j+1);
		}
	}

}
