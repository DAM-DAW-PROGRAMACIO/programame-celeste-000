package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p154 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		String lletresPossibles = "BCDFGHJKLMNPQRSTVWXYZ";
		
		while (!line.equals("9999 ZZZ")) {
			String dades[] = line.split(" ");
			String lletres[] = dades[1].split("");
			int num = Integer.parseInt(dades[0]);
			num++;
			
			if (num != 10000) {
				System.out.println(num + " " + lletres[0] + lletres[1] + lletres[2]);
			}
			else {
				num = 0;
				for (int i = 0; i < lletresPossibles.length(); i++) {
					
				}
				System.out.println(String.format("%04d",num) + " " + lletres[0] + lletres[1] + lletres[2]);
			}
			
			line = br.readLine();
		}
	}
}
