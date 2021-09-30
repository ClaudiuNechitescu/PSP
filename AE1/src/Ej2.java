import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Selecciona qué quieres utilizar:\n1. Array\n2.Lista");
		int respuesta = Integer.parseInt(br.readLine());
		if(respuesta==1) {
			a();
		}
		else {
			b();
		}
		
	}
	public static void a() {
		String[] nombres = new String[] {"Manel", "NestorR","VictorF","NestorL","Josep","XimoB"};

		for(String elemento : nombres) {
			System.out.println(elemento);
		}
	}
	public static void b() {
		List<String> nombres = new ArrayList<String>(Arrays.asList("Manel", "NestorR","VictorF","NestorL","Josep","XimoB"));
		for(String elemento : nombres) {
			System.out.println(elemento);
		}
	}
}
