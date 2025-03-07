package Easy;

import java.util.Scanner;

public class p347 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String line = sc.nextLine();
		
		while (!line.equals("0 0")) {
			String entrada[] = line.split(" ");
			int num1 = Integer.parseInt(entrada[0]);
			int num2 = Integer.parseInt(entrada[1]);
			int pajaritas = 0;
			
			if (num1 < 10 || num2 < 10)
				System.out.println("0");
			else {
				int major = Math.max(num1, num2);
				int menor = Math.min(num1, num2);
				while (major >= 10 && menor >= 10) {
					int aux3 = major / menor;
					pajaritas += aux3;
					major -= aux3 * menor;
					int aux = Math.max(major, menor);
					int aux2 = Math.min(major, menor);
					
					major = aux;
					menor = aux2;
				}
				System.out.println(pajaritas);
			}
			
			line = sc.nextLine();
		}
		sc.close();
	}
}
