package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p117 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		int persones = Integer.parseInt(line);
		
		for (int i = 0; i < persones; i++) {
			line = br.readLine();
			String text[] = line.split(" ");
			System.out.println("Hola, " + text[1] + ".");
		}
	}
}
