package Easy;

import java.util.Scanner;

public class p455 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			int numerador = sc.nextInt();
			int mcd = 1;
			
			for (int j = numerador; j > 1; j--) {
				if (numerador % j == 0 && 10000 % j == 0) {
					mcd = j;
					break;
				}
			}
			System.out.println(10000 / mcd);
		}
		sc.close();
	}
}
