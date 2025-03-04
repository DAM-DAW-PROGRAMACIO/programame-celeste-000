package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p337 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		int casos = Integer.parseInt(line);
		
		for (int i = 0; i < casos; i++) {
			line = br.readLine();
			String superiores[] = line.split(" ");
			line = br.readLine();
			String inferiores[] = line.split(" ");
			boolean encaixen = true;
			
			int mida = Integer.parseInt(superiores[0]) + Integer.parseInt(inferiores[0]);
			for (int j = 1; j < superiores.length; j++) {
				if (Integer.parseInt(superiores[j]) + Integer.parseInt(inferiores[j]) != mida) {
					encaixen = false;
				}
			}
			if (!encaixen) {
				System.out.println("NO");
			}
			else {
				System.out.println("SI");
			}
		}
	}
}
