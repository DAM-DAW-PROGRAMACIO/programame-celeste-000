package Easy;

import java.util.Scanner;

public class p536 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			int nTerrenos = Integer.parseInt(line);
			
			int millorTamany = sc.nextInt();
			int millorAbono = sc.nextInt();
			int millorAigua = sc.nextInt();
			int millorDistancia = sc.nextInt();
			String millorPropietari = sc.nextLine().trim();
			
			for (int i = 1; i < nTerrenos; i++) {
				int tamany = sc.nextInt();
				int abono = sc.nextInt();
				int aigua = sc.nextInt();
				int distancia = sc.nextInt();
				String propietari = sc.nextLine().trim();
				
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
			
		}
		sc.close();
	}
}
