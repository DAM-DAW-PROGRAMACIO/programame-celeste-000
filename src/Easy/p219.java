package Easy;

import java.util.Scanner;

public class p219 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			int decimos = sc.nextInt();
			int parells = 0;
			int num;
			for (int j = 0; j < decimos; j++) {
				num = sc.nextInt();
				if (num % 2 == 0) {
					parells++;
				}
			}
			System.out.println(parells);
		}
		sc.close();
	}
}
