package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p335 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		int casos = Integer.parseInt(line);
		
		for (int i = 0; i < casos; i++) {
			line = br.readLine();
			int files = Integer.parseInt(line);
			long canicas = 0;
			long total = 0;
			for (int j = 1; j <= files; j++) {
				canicas += j;
				total += canicas;
			}
			System.out.println(total);
		}
	}
}
