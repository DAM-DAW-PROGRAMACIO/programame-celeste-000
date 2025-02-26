package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p219 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		int casos = Integer.parseInt(line);
		
		for (int i = 0; i < casos; i++) {
			line = br.readLine();
			int decimos = Integer.parseInt(line);
			line = br.readLine();
			String entrada[] = line.split(" ");
			int numeros[] = new int[entrada.length];
			for (int j = 0; j < numeros.length; j++) {
				numeros[j] = Integer.parseInt(entrada[j]);
			}
			
			int parells = 0;
			for (int j = 0; j < decimos; j++) {
				if (numeros[j] % 2 == 0) {
					parells++;
				}
			}
			System.out.println(parells);
		}
	}
}
