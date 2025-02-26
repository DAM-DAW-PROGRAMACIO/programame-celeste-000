package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p148 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while (!line.equals("00:00")) {
			String entrada[] = line.split(":");
			int hores[] = new int[entrada.length];
			for (int i = 0; i < hores.length; i++) {
				hores[i] = Integer.parseInt(entrada[i]);
			}
			int minutsRestants = 60 - hores[1] + (23 - hores[0]) * 60;
			System.out.println(minutsRestants);
			
			line = br.readLine();
		}
	}
}
