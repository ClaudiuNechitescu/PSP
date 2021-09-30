import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int suma=0;
		System.out.print("Introduce el número: ");
		int num = Integer.parseInt(br.readLine());
		for (int i = 0;i<=num;i++) {
			if(i%2==0) {
				suma+=i;
			}
		}
		System.out.println(suma);
	}

}
