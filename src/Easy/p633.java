package Easy;

import java.util.Scanner;
import java.util.TreeSet;

public class p633 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		
		while (!line.equals("0")) {
			int quant = Integer.parseInt(line);
			int parelles = 0;
			int incomplets = 0;
			int repetits = 0;
			TreeSet<String> noRepetits = new TreeSet<String>();
			TreeSet<String> machos = new TreeSet<String>();
			TreeSet<String> hembras = new TreeSet<String>();
			
			for (int i = 0; i < quant; i++) {
				String animal = sc.next();
				if (!noRepetits.add(animal))
					repetits++;
				else {
					if (animal.substring(animal.length() - 1).equals("o"))
						machos.add(animal);
					else if (animal.substring(animal.length() - 1).equals("a"))
						hembras.add(animal);
				}
				for (String nom : machos) {
					String especie = nom.substring(0, nom.length() - 1);
					if (hembras.contains(especie + "a")) {
						machos.remove(nom);
						hembras.remove(especie + "a");
						parelles++;
					}
				}
			}
			incomplets = machos.size() + hembras.size();
			System.out.println(parelles + " " + incomplets + " " + repetits);
			
			line = sc.next();
		}
		sc.close();
	}
}
