package Easy;

import java.util.Scanner;

public class p605 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		
		while (!line.equals(".")) {
			int verano = 0;
			int invierno = 0;
			
			while (true) {
				if (line.equals("V")) {
					verano++;
				}
				else if (line.equals("I")) {
					invierno++;
				}
				else if (line.equals(".")) {
					break;
				}
				line = sc.next();
			}
			if (verano > invierno) {
				System.out.println("VERANO");
			}
			else if (invierno > verano) {
				System.out.println("INVIERNO");
			}
			else {
				System.out.println("EMPATE");
			}
			line = sc.next();
		}
		sc.close();
	}
}
