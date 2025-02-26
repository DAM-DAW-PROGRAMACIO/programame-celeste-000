package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p536 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while (line != null) {
			int nTerrenos = Integer.parseInt(line);
			String dTerrenos[][] = new String[nTerrenos][5];

			for (int i = 0; i < nTerrenos; i++) {
				line = br.readLine();
				if (line != null) {
					String dades[] = line.split(" ");
					dTerrenos[i] = dades;
				}
				
				String resultat = dTerrenos[0][4];
				
				if(nTerrenos < 2) {
					resultat = dTerrenos[0][4];
				}
				else {
					if (Integer.parseInt(dTerrenos[0][0]) > Integer.parseInt(dTerrenos[1][0])){
						resultat = dTerrenos[0][4];
					}
					else if (Integer.parseInt(dTerrenos[0][0]) < Integer.parseInt(dTerrenos[1][0])){
						resultat = dTerrenos[1][4];
					}
					else {
						if (Integer.parseInt(dTerrenos[0][2]) < Integer.parseInt(dTerrenos[1][2])){
							resultat = dTerrenos[0][4];
						}
						else if (Integer.parseInt(dTerrenos[0][2]) > Integer.parseInt(dTerrenos[1][2])){
							resultat = dTerrenos[1][4];
						}
						else {
							if (Integer.parseInt(dTerrenos[0][3]) < Integer.parseInt(dTerrenos[1][3])){
								resultat = dTerrenos[0][4];
							}
							else if (Integer.parseInt(dTerrenos[0][3]) < Integer.parseInt(dTerrenos[1][3])) {
								resultat = dTerrenos[1][4];
							}
							else {
								if (Integer.parseInt(dTerrenos[0][1]) < Integer.parseInt(dTerrenos[1][1])) {
									resultat = dTerrenos[0][4];
								}
								else if (Integer.parseInt(dTerrenos[0][1]) > Integer.parseInt(dTerrenos[1][1])) {
									resultat = dTerrenos[1][4];
								}
							}
						}
					}
				}
				System.out.println(resultat);
				line = br.readLine();
			}
		}
	}
}
