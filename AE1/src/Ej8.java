import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		long tInicio= System.nanoTime();
		intervalo();
		long tFinal = System.nanoTime();
		double total = (tFinal-tInicio)*Math.pow(10, -9);
		System.out.println("Tiempo consumido en la ejecución del método: " + total + " segundos");
		
	}
	public static void intervalo() throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Introduce el primer número del intervalo: ");
		int primero = Integer.parseInt(br.readLine());
		System.out.print("Introduce el último número del intervalo: ");
		int ultimo = Integer.parseInt(br.readLine());
		Boolean primo;
		for(int i = primero;i<=ultimo;i++) {
			primo=true;
			if(i==1) {
				primo=true;
			}
			for(int j = 2;j<i;j++) {
				if(i%j==0) {
					primo=false;
				}
			}
			if(primo) {
				System.out.println(i + " Primo");
			}
			else {
				System.out.println(i + " No primo");
			}
		}
		
	}
}
