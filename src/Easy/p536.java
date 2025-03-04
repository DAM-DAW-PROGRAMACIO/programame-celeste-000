package Easy;

import java.util.Scanner;

public class p536 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		while (line != null) {
			int nTerrenos = Integer.parseInt(line);
			
			line = sc.nextLine();
			String dadesInicials[] = line.split(" ", 5);
			int millorTamany = Integer.parseInt(dadesInicials[0]);
			int millorAbono = Integer.parseInt(dadesInicials[1]);
			int millorAigua = Integer.parseInt(dadesInicials[2]);
			int millorDistancia = Integer.parseInt(dadesInicials[3]);
			String millorPropietari = dadesInicials[4];
			
			for (int i = 0; i < nTerrenos; i++) {
				line = sc.nextLine();
				String dades[] = line.split(" ", 5);
				int tamany = Integer.parseInt(dades[0]);
				int abono = Integer.parseInt(dades[1]);
				int aigua = Integer.parseInt(dades[2]);
				int distancia = Integer.parseInt(dades[3]);
				String propietari = dades[4];
				
				if (tamany > millorTamany || tamany == millorTamany && aigua < millorAigua ||
						tamany == millorTamany && aigua == millorAigua && distancia < millorDistancia ||
						tamany == millorTamany && aigua == millorAigua && distancia == millorDistancia && abono < millorAbono) {
					
					millorTamany = tamany;
					millorAbono = abono;
					millorAigua = aigua;
					millorDistancia = distancia;
					millorPropietari = propietari;
				}
			}
			System.out.println(millorPropietari);
			
			line = sc.next();
		}
		sc.close();
	}
}
