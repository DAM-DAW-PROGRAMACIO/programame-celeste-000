package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p409 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		int casos = Integer.parseInt(line);
		
		for (int i = 0; i < casos; i++) {
			line = br.readLine();
			String primeraLinia[] = line.split(" ");
			int cpn = Integer.parseInt(primeraLinia[0]);
			int integrants = Integer.parseInt(primeraLinia[1]);
			
			line = br.readLine();
			String segonaLinia[] = line.split(" ");
			int alcades[] = new int[segonaLinia.length];
			for (int j = 0; j < segonaLinia.length; j++) {
				alcades[j] = Integer.parseInt(segonaLinia[j]);
			}
			
			Arrays.sort(alcades);
			int nivells = 0;
			int index = 0;
			
			while (index + cpn <= integrants) {
				int minima = alcades[index];
				int maxima = alcades[index + cpn - 1];
				
				if (maxima - minima <= 15) {
					nivells++;
					index += cpn;
				}
				else {
					index++;
				}
			}
			System.out.println(nivells);
		}
	}
}
