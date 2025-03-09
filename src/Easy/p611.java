package Easy;

import java.util.Scanner;
import java.util.TreeMap;

public class p611 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			TreeMap<Integer, String> dades = new TreeMap<>();
			int anyInici = sc.nextInt();
			sc.nextLine();
			int casos = sc.nextInt();
			int any;
			String titol;
			
			for (int i = 0; i < casos; i++) {
				any = sc.nextInt();
				titol = sc.nextLine();
				if (any >= anyInici) {
					dades.put(any, titol);
				}
			}
			if (dades.size() == casos)
				System.out.println("TODAS");
			else if (dades.size() == 0)
				System.out.println("NINGUNA");
			else {
				int key = dades.firstKey();
				System.out.println(dades.get(key).trim());
			}
		}
		sc.close();
	}
}
