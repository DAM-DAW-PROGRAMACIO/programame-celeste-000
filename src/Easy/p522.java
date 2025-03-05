package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p522 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		
		while (line != null) {
			String entrada[] = line.split(" ");
			String paraula1 = entrada[0];
			String paraula2 = entrada[1];
			
			if (paraula1.startsWith(paraula2)) {
				System.out.println(paraula2);
			}
			else if (paraula2.startsWith(paraula1)) {
				System.out.println(paraula1);
			}
			else {
				if (paraula1.compareTo(paraula2) > 0) {
					System.out.println(paraula1);
				}
				else {
					System.out.println(paraula2);
				}
			}
			
			line = br.readLine();
		}
	}
}
