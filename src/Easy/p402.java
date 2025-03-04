package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p402 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while (!line.equals("0")) {
			int peces = Integer.parseInt(line);
			int costat = (int)Math.sqrt(peces);
			if (costat * costat == peces) {
				System.out.println(costat);
			}
			else {
				while (peces % costat != 0) {
					costat--;
				}
				int costatLlarg = peces / costat;
				System.out.println(costatLlarg);
			}
			
			line = br.readLine();
		}
	}
}
