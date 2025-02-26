package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p241 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		int casos = Integer.parseInt(line);
		
		for (int i = 0; i < casos; i++) {
			line = br.readLine();
			int hojas = Integer.parseInt(line);
			
			if (hojas < 3) {
				System.out.println("IMPOSIBLE");
			}
			else {
				System.out.println(hojas / 4);
			}
		}
	}
}
