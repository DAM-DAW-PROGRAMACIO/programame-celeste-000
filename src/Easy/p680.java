package Easy;

import java.util.Scanner;

public class pF {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			int recorregut = sc.nextInt();
			int avanca = sc.nextInt();
			int retroces = sc.nextInt();
			int total = 0;
			int ciclos = 0;
			
			if (avanca >= recorregut)
				System.out.println("1");
			else if (retroces >= avanca)
				System.out.println("IMPOSIBLE");
			else {
				while (!(total >= recorregut)) {
					total += avanca;
					if (total >= recorregut) {
						ciclos++;
						break;
					}
					else {
						total -= retroces;
						ciclos++;
					}
				}
				System.out.println(ciclos);
			}
		}
		sc.close();
	}
}
