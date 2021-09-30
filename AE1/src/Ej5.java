import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Ej5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		double[] numeros = new double[] {1,2,3,4,5,6,7,8,9};
		List<Integer> numeros2 = Arrays.asList(1, 2, 3,4,5,6,7,8,9);
		System.out.println("Selecciona qué quieres utilizar:\n1. Array\n2.Lista");
		int respuesta = Integer.parseInt(br.readLine());
		if(respuesta==1) {
			System.out.println(mayor(numeros));
		}
		else {
			System.out.println(mayor(numeros2));
		}

		mayor(numeros);
	}
	
	public static double mayor(List<Integer> arr) {
		double mayor = 0;
		for(double a : arr) {
			if(a>mayor) {
				mayor=a;
			}
		}
		return mayor;
	}

	public static double mayor(double[] arr) {
		double mayor = 0;
		for(double a : arr) {
			if(a>mayor) {
				mayor=a;
			}
		}
		return mayor;
	}

}
