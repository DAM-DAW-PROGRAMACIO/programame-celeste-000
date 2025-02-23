package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p340 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		int casos = Integer.parseInt(line);
		
		for (int i = 0; i < casos; i++) {
			line = br.readLine();
			String entrada[] = line.split(" ");
			int numeros[] = new int[2];
			for (int j = 0; j < 2; j++)
				numeros[j] = Integer.parseInt(entrada[j]);
			
			long total = (3 * numeros[0] + 1) + (numeros[1] - 1) * (2 * numeros[0] + 1);
			System.out.println(total);
		}
	}
}
