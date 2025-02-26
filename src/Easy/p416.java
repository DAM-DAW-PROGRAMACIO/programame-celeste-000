package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class p416 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		
		while (!line.equals("0")) {
			int persones = Integer.parseInt(line);
			HashSet<String> aniversaris = new HashSet<String>();
			String diaIMes;
			line = br.readLine();
			String dates[] = line.split(line);
			String dataSeparada[][] = new String[dates.length][3];
			
			for (int i = 0; i < dates.length; i++) {
				dataSeparada[i] = dates[i].split("/");
			}
			
			for (int i = 0; i < dates.length; i++) {
				for (int j = 0; j < 2; j++) {
					diaIMes += dataSeparada[i][j];
				}
			}
			
			line = br.readLine();
		}
	}
}
