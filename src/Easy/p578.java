package Easy;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class p578 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String line = sc.nextLine();
		
		while (!line.equals("0")) {
			LinkedHashSet<String> productos = new LinkedHashSet<String>();
			int casos = Integer.parseInt(line);
			String producte;
			int cont = 0;
			for (int i = 0; i < casos; i++) {
				producte = sc.nextLine().toLowerCase();
				if (productos.add(producte)) {
					cont++;
				}
			}
			System.out.println(cont);

			line = sc.nextLine();
		}
		sc.close();
	}
}
