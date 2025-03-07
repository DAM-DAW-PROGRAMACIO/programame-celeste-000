package Easy;

import java.util.Scanner;

public class p635 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			int any = sc.nextInt();
			if (any <= 100) {
				System.out.println("1");
			}
			else {
				if (any % 100 == 0) {
					System.out.println(any / 100);
				}
				else {
					System.out.println(any / 100 + 1);
				}
			}
		}
		sc.close();
	}
}
