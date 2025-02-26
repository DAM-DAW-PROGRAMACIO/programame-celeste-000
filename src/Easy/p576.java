package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p576 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while(!line.equals("0")) {
			int segons = Integer.parseInt(line);
			line = br.readLine();
			String entrada[] = line.split(" ");
			int segonsTotals = 0;
			
			int numeros[] = new int[entrada.length];
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = Integer.parseInt(entrada[i]);
				segonsTotals += segons * numeros[i];
			}
			int hores = segonsTotals / 3600;
			int minuts = segonsTotals % 3600 / 60;
			int segon = segonsTotals % 3600 % 60;
			
			System.out.println(String.format("%02d", hores) + ":" + String.format("%02d", minuts) + ":" + String.format("%02d", segon));
			
			line = br.readLine();
		}
	}
}
