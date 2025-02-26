package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p605 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while (!line.equals(".")) {
			int verano = 0;
			int invierno = 0;
			String entrada[] = line.split(" ");
			int i = 0;
			
			while (!entrada[i].equals(".")) {
				if (entrada[i].equals("V")) {
					verano++;
				}
				else if (entrada[i].equals("I")) {
					invierno++;
				}
				else if (entrada[i].equals("A")) {
					verano++;
					invierno++;
				}
				i++;
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
			line = br.readLine();
		}
	}
}
