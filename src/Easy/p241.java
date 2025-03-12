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
			
			if (hojas == 0 || hojas == 1 || hojas == 2 || hojas == 5) {
				System.out.println("IMPOSIBLE");
			}
			else {
				if (hojas % 3 == 0)
					System.out.println("0");
				else if (hojas % 3 == 1)
					System.out.println("1");
				else if (hojas % 3 == 2)
					System.out.println("2");
			}
		}
	}
}
