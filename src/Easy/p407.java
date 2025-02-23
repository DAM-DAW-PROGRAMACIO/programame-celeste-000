package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p407 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while (!line.equals("0 0 0")) {
			String entrada[] = line.split(" ");
			int dades[] = new int[entrada.length];
			for (int i = 0; i < entrada.length; i++) {
				dades[i] = Integer.parseInt(entrada[i]);
			}
			int casellesXArribar = dades[0] - dades[1];
			int casellaFinal = dades[0] - (dades[2] - casellesXArribar);
			System.out.println(casellaFinal);
					
			line = br.readLine();
		}
	}
}
