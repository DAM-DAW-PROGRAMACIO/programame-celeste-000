package Easy;

import java.util.Scanner;

public class p112 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		while (!line.equals("0 0 0")) {
			int distancia = Integer.parseInt(line.split(" ")[0]);
			int vMax = Integer.parseInt(line.split(" ")[1]);
			int temps = Integer.parseInt(line.split(" ")[2]);
			
			double velocitat = ((double)distancia / temps) / 1000 * 3600;
			if (temps <= 0 || distancia <= 0 || vMax <= 0) {
				System.out.println("ERROR");
			}
			else if (velocitat <= vMax) {
				System.out.println("OK");
			}
			else if (velocitat < vMax * 1.2) {
				System.out.println("MULTA");
			}
			else if (velocitat >= vMax * 1.2) {
				System.out.println("PUNTOS");
			}
			
			line = sc.nextLine();
		}
		sc.close();
	}
}
