package Easy;

import java.util.Scanner;

public class p401 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			String paraula1 = sc.next().toLowerCase().replace('b', 'v');
			String paraula2 = sc.next().toLowerCase().replace('b', 'v');
			
			if (paraula1.equals(paraula2)) {
				System.out.println("NO");
			}
			else if (paraula1.length() != paraula2.length()) {
				System.out.println("NO");
			}
			else {
				paraula1 += paraula1;
				if (paraula1.contains(paraula2)) {
					System.out.println("SI");
				}
				else {
					System.out.println("NO");
				}
			}
		}
		sc.close();
	}
}
