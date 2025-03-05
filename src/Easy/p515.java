package Easy;

import java.util.Scanner;

public class p515 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int copas = sc.nextInt();
		while (copas != 0) {
			int paseos = 0;
			int copasRestantes = copas;
			while (copasRestantes != 0) {
				copasRestantes--;
				paseos++;
				if (copasRestantes != 0) {
					if (copasRestantes % 2 == 0) {
						copasRestantes -= 2;
						paseos++;
					}
					else {
						copasRestantes--;
						paseos++;
					}
				}
			}
			System.out.println(paseos);
			
			copas = sc.nextInt();
		}
		sc.close();
	}
}
