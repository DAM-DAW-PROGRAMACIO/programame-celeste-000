package Easy;

import java.util.Scanner;

public class p512 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			int conill = sc.nextInt();
			int cavall = sc.nextInt();
			int total = conill + cavall;
			System.out.println(conill * 100 / total);
		}
		sc.close();
	}
}
