package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p764 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while (!line.equals("0")) {
			int nCampanas = Integer.parseInt(line);
			int avesAnilladas = 0;
			for (int i = 0; i < nCampanas; i++) {
				line = br.readLine();
				String campana[] = line.split(" ");
				int num[] = new int[campana.length];
				for (int j = 0; j < num.length; j++) {
					num[j] = Integer.parseInt(campana[j]);
				}
				avesAnilladas += num[0] - num[1];
			}
			System.out.println(avesAnilladas);
			
			line = br.readLine();
		}
	}
}
