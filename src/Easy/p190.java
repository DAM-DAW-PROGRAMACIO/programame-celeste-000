package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p190 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while (line != null) {
			String entrada[] = line.split(" ");
			int num = Integer.parseInt(entrada[0]);
			int den = Integer.parseInt(entrada[1]);
			
			if (num < den) {
				break;
			}
			
			long resultat = 1;
			
			for (int i = den + 1; i <= num; i++) {
				resultat *= i;
			}
			
			System.out.println(resultat);
			
			line = br.readLine();
		}
	}
}
