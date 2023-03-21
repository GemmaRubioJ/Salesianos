package recursividad;

public class Ejercicio6 {
	
	public static void main(String[] args) {
    System.out.println(encontrarN(15)); 
   }
          
   public static int encontrarN(int m) {
       return encontrarN(m, 0, 1);
   }
   
   public static int encontrarN(int m, int suma, int n) {
	   if (suma > m) return n-1;
	   else return encontrarN (m, suma+n, n+1);
   }
}
