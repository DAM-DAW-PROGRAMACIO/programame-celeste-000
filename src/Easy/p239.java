package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p239 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while (!line.equals("0 0")) {
			String entrada[] = line.split(" ");
			
			long segonsTotals = Integer.parseInt(entrada[0]) * Integer.parseInt(entrada[1]) * 24 * 6;
			
			long dies = segonsTotals / (3600 * 24);
			segonsTotals %= (3600 * 24);
			long hores = segonsTotals / 3600;
			segonsTotals %= 3600;
			long minuts = segonsTotals / 60;
			long segons = segonsTotals % 60;
			
			System.out.format("%d:%02d:%02d:%02d\n", dies, hores, minuts, segons);
			
			line = br.readLine();
		}
	}
}
