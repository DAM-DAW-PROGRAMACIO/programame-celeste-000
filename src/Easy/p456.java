package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p456 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		int num = Integer.parseInt(line);
		
		for (int i = 0; i < num; i++) {
			line = br.readLine();
			String dades[] = line.split(" ");
			int quadrats[] = new int[dades.length];
			for (int j = 0; j < dades.length; j++) {
				quadrats[j] = Integer.parseInt(dades[j]);
			}
			int minTab = quadrats[2] / (quadrats[0] * quadrats[1]) + 1;
			System.out.println(minTab);
		}
	}
}
