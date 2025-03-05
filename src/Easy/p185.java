package Easy;

import java.util.Scanner;
import java.util.TreeSet;

public class p185 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String line = sc.next();
		
		while (!line.equals("0")) {
			int nPotitos = Integer.parseInt(line);
			TreeSet<String> ingredients = new TreeSet<String>();
			String resultat = "";
			for (int i = 0; i < nPotitos; i++) {
				while (!line.equals("FIN")) {
					line = sc.next();
				}
			}
			line = sc.next();
		}
		sc.close();
	}
}
