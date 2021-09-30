import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ej6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		double sumatorio = enteros();
		System.out.println("La suma de los números es " + sumatorio);
	}

	public static double enteros() throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		double suma=0;
		int[] numeros=new int[5];
		for(int i=0;i<numeros.length;i++) {
			System.out.print("Introduce el entero "+(i+1)+": ");
			numeros[i] = Integer.parseInt(br.readLine());
			suma+=numeros[i];
		}
		Arrays.sort(numeros);
		for(int j=numeros.length-1;j>=0;j--) {
			System.out.println(numeros[j]);
		}
		return suma;
	}
}
