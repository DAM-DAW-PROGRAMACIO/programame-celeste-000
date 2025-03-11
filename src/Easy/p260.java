package Easy;

import java.util.Scanner;
import java.util.Arrays;

public class p260 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String line = sc.nextLine();
		int casos = Integer.parseInt(line);
		
		for (int i = 0; i < casos; i++) {
			line = sc.nextLine();
			line = line.replaceAll("\\s", "").toLowerCase();
			char frase1[] = line.toCharArray();
			
			line = sc.nextLine();
			line = line.replaceAll("\\s", "").toLowerCase();
			char frase2[] = line.toCharArray();
			
			if (frase1.length == frase2.length) {
				Arrays.sort(frase1);
				Arrays.sort(frase2);
				boolean anagrama = true;
				for ( int j = 0; j < frase1.length; j++) {
					if (frase1[j] != frase2[j]) {
						anagrama = false;
						break;
					}
				}
				if (anagrama)
					System.out.println("SI");
				else
					System.out.println("NO");
			}
			else
				System.out.println("NO");
		}
		sc.close();
	}
}
