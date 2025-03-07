package Easy;

import java.util.Scanner;

public class p344 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int casos = sc.nextInt(); 
		
		for (int i = 0; i < casos; i++) {
			int cables = sc.nextInt();
			int m = 0;
			int h = 0;
			String lletres;
			char primer;
			char segon;
			for (int j = 0; j < cables; j++) {
				lletres = sc.next();
				
				primer = lletres.charAt(0);
				if (primer == 'H') {
					h++;
				}
				else if (primer == 'M') {
					m++;
				}
				
				segon = lletres.charAt(1);
				if (segon == 'H') {
					h++;
				}
				else if (segon == 'M') {
					m++;
				}
			}
			
			if (h == m) {
				System.out.println("POSIBLE");
			}
			else {
				System.out.println("IMPOSIBLE");
			}
		}
		sc.close();
	}
}
