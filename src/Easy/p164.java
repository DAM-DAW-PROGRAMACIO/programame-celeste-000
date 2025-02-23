package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p164 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while (line != null) {
			String entrada[] = line.split(" ");
			int numeros[] = new int[entrada.length];
			for (int i = 0; i < entrada.length; i++) {
				numeros[i] = Integer.parseInt(entrada[i]);
			}
			if (numeros[2] < numeros[0] || numeros[3] < numeros[1])
				break;
			
			int area = (numeros[2] - numeros[0]) * (numeros[3] - numeros[1]);
			System.out.println(area);
			
			line = br.readLine();
		}
	}
}
