package Easy;

import java.util.Scanner;
import java.util.TreeSet;

public class p185 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int nPotitos = sc.nextInt();
		
		while (nPotitos != 0) {
			TreeSet<String> ingredientsSi = new TreeSet<String>();
			TreeSet<String> ingredientsNo = new TreeSet<String>();
			for (int i = 0; i < nPotitos; i++) {
				String afirmacio = sc.next().trim();
				String paraules = sc.next().trim();
				if (afirmacio.equals("SI:")) {
					while (!paraules.equals("FIN")) {
						ingredientsSi.add(paraules);
						paraules = sc.next().trim();
					}
				}
				else if (afirmacio.equals("NO:")) {
					while (!paraules.equals("FIN")) {
						ingredientsNo.add(paraules);
						paraules = sc.next();
					}
				}
			}
			TreeSet<String> diferencia = new TreeSet<String>(ingredientsNo);
			diferencia.removeAll(ingredientsSi);
			String resultat = "";
			for (String nom : diferencia) {
				resultat += nom + " ";
			}
			System.out.println(resultat.trim());
			
			nPotitos = sc.nextInt();
		}
		sc.close();
	}
}
