package Easy;

import java.util.Scanner;

public class p424 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int moviments = sc.nextInt();
		
		while (moviments != 0) {
			long total = 0;
			long maxim = 0;
			long valor;
			for (int i = 0; i < moviments; i++) {
				valor = sc.nextLong();
				total += valor;
				
				if(total > maxim) {
					maxim = total;
				}
			}
			System.out.println(total + " " + maxim);
			
			moviments = sc.nextInt();
		}
		sc.close();
	}
}
