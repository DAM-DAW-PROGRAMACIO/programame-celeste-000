package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p300 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		int casos = Integer.parseInt(line);
		
		for (int i = 0; i < casos; i++) {
			line = br.readLine();
			if (line.contains("a") && line.contains("e") && line.contains("i") && line.contains("o") && line.contains("u")) {
				System.out.println("SI");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
