import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		nivelSalario();
	}
	
	public static void nivelSalario() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Introduce el nombre: ");
		String nombre =br.readLine();
		System.out.print("Introduce los años de experiencia: ");
		double anyos =  Double.parseDouble(br.readLine());
		if(anyos<1) {
			System.out.println(nombre + "\n\t" + "Desarrollador Junior L1" + "\n\t" + "15000-18000");
		}
		else if(anyos>=1&&anyos<=2) {
			System.out.println(nombre + "\n\t" + "Desarrollador Junior L2" + "\n\t" + "18000-22000");
		}
		else if(anyos>=3&&anyos<=5) {
			System.out.println(nombre + "\n\t" + "Desarrollador Senior L1" + "\n\t" + "22000-28000");
		}
		else if(anyos>=6&&anyos<=8) {
			System.out.println(nombre + "\n\t" + "Desarrollador Senior L2" + "\n\t" + "28000-36000");
		}
		else if(anyos>8){
			System.out.println(nombre + "\n\t" + "Analista / Arquitecto" + "\n\t" + "Salario a convenir en base a rol");
		}

	}

}
