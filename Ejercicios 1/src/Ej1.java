import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Introduce el primer número: ");
			
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Introduce el segundo número: ");
		int num2 = Integer.parseInt(br.readLine());
		int suma = num1+num2;
		System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
	}

}
